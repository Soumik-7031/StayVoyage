package com.soumik.StayVoyage.Dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class UpdateInventoryRequestDTO {
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal surgeFactor;
    private Boolean closed;
}
