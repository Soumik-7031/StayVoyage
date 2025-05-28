package com.soumik.StayVoyage.Dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import com.soumik.StayVoyage.Enums.BookingStatus;

@Data
public class BookingDTO {
    private Long id;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDTO> guests;
    private BigDecimal amount;
}

