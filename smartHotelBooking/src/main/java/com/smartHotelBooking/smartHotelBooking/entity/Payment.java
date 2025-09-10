package com.smartHotelBooking.smartHotelBooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long paymentId;
    private Long bookingId;
    private Double amount;
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private String paymentStatus;
}

