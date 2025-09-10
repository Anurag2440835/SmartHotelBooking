package com.smartHotelBooking.smartHotelBooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoyaltyAccount {
    private Long loyaltyId;
    private Long userId;
    private Integer pointsBalance;
    private LocalDateTime lastUpdated;
}
