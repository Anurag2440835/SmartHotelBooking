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
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewId", nullable = false)
    private Long reviewId;
    @Column(name = "hotelId", nullable = false)
    private Long hotelId;
    @Column(name = "rating", nullable = false, precision = 3, scale = 2)
    private Double rating;
    @Column(name = "comment", columnDefinition = "TEXT")
    private String comment;
    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @ManyToOne
    private User userId;
}
