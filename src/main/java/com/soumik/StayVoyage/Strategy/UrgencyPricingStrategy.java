package com.soumik.StayVoyage.Strategy;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.soumik.StayVoyage.Entities.InventoryEntity;

@RequiredArgsConstructor
public class UrgencyPricingStrategy implements PricingStrategy{

    private final PricingStrategy wrapped;

    @Override
    public BigDecimal calculatePrice(InventoryEntity inventory) {
        BigDecimal price = wrapped.calculatePrice(inventory);

        LocalDate today = LocalDate.now();
        if(!inventory.getDate().isBefore(today) && inventory.getDate().isBefore(today.plusDays(7))) {
            price = price.multiply(BigDecimal.valueOf(1.15));
        }
        return price;
    }
}

