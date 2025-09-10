package com.smartHotelBooking.smartHotelBooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    private Long bookingId;
    private Long userId;
    private Long roomId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDate bookingDate;
    private String status;
}
