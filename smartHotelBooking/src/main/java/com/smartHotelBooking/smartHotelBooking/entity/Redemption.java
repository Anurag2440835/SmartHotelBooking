package com.smartHotelBooking.smartHotelBooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Redemption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "redemptionId", nullable = false)
    private Long redemptionId;
    @Column(name = "userId", nullable = false)
    private Long userId;
    @Column(name = "bookingId", nullable = false)
    private Long bookingId;
    @Column(name = "pointsUsed", nullable = false)
    private Integer pointsUsed;
    @Column(name = "discountAmount", nullable = false, precision = 10, scale = 2)
    private Double discountAmount;
}