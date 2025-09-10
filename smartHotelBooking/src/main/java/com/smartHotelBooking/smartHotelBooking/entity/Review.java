package com.smartHotelBooking.smartHotelBooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private Long reviewId;
    private Long userId;
    private Long hotelId;
    private Double rating;
    private String comment;
    private LocalDateTime timestamp;
}
