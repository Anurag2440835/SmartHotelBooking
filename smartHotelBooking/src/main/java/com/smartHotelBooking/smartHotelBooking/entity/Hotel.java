package com.smartHotelBooking.smartHotelBooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    private Long hotelId;
    private String name;
    private String location;
    private Long managerId;
    private String amenities;
    private Double rating;
}