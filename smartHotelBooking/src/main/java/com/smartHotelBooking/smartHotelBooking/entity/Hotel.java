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
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "hotelId")
        private Long hotelId;
        @Column(name = "name", nullable = false, length = 50)
        private String name;
        @Column(name = "location", nullable = false)
        private String location;
        @Column(name = "managerId", unique = true)
        private Long managerId;
        @Column(name = "amenities", nullable = false)
        private String amenities;
        @Column(name = "rating")
        private Double rating;

        @OneToMany(mappedBy = "hotelId")
        private List<Room> roomList;

        @OneToMany(mappedBy = "hotelId")
        private List<Review> reviewList;

}