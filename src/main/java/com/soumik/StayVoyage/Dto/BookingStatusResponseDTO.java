package com.soumik.StayVoyage.Dto;

import com.soumik.StayVoyage.Enums.BookingStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingStatusResponseDTO {
    private BookingStatus bookingStatus;
}
