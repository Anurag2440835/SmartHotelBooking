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
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId")
    private Long paymentId;


    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @JoinColumn(name = "bookingId", nullable = false)
    private Booking booking;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "paymentDate", nullable = false)
    private LocalDateTime paymentDate;

    @Column(name = "paymentMethod", nullable = false)
    private String paymentMethod;

    @Column(name = "paymentStatus", nullable = false)
    private String paymentStatus;

    @ManyToOne
    private User userId;
}

