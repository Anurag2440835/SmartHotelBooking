package com.smartHotelBooking.smartHotelBooking.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Column(name = "roomId")
    private Long roomId;
//    @Column(name = "hotelId",nullable = false)
//    private Long hotelId;
    @Column(name = "type",nullable = false)
    private String type;
    @Column(name = "price",nullable = false)
    private Double price;
    @Column(name = "availability",nullable = false)
    private Boolean availability;
    @Column(name = "features")
    private String features;

    @ManyToOne
    @JoinColumn(name = "hotelId")
    private Hotel hotelId;
}