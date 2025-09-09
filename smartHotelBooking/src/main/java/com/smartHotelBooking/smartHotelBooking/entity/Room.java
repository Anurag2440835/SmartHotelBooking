package com.smartHotelBooking.smartHotelBooking.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    private Long roomId;
    private Long hotelId;
    private String type;
    private Double price;
    private Boolean availability;
    private String features;
}