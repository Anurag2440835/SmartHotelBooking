package com.smartHotelBooking.smartHotelBooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Redemption {
    private Long redemptionId;
    private Long userId;
    private Long bookingId;
    private Integer pointsUsed;
    private Double discountAmount;
}