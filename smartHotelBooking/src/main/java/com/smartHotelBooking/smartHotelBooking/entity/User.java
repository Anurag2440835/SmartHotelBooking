package com.smartHotelBooking.smartHotelBooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int userId;
    @Column(name = "name", nullable = false, length = 40)
    private String name;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "password", nullable = false, length = 20)
    private String password;
    @Column(name = "role", nullable = false)
    private Role role;
    @Column(name = "contactNumber",nullable = false, length = 10)
    private String contactNumber;

    @OneToMany(mappedBy = "userId")
    private List<Booking> bookingList;

    @OneToMany(mappedBy = "userId")
    private List<Payment> paymentList;

    @OneToMany(mappedBy = "userId")
    private List<Review> reviewList;

}
