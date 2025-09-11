package com.smartHotelBooking.smartHotelBooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoyaltyAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loyaltyId", nullable = false)
    private Long loyaltyId;
    @OneToOne
    @JoinColumn(name = "userId", nullable = false, unique = true)
    private User user;
    @Column(name = "pointsBalance", nullable = false)
    private Integer pointsBalance;
    @Column(name = "lastUpdated", nullable = false)
    private LocalDateTime lastUpdated;
}
