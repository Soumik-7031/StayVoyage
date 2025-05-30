package com.soumik.StayVoyage.Dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BookingRequest {
    private Long hotelId;
    private Long roomId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Integer roomsCount;
}

