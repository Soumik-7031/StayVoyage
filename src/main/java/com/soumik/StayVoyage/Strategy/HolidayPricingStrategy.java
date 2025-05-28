package com.soumik.StayVoyage.Strategy;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

import com.soumik.StayVoyage.Entities.InventoryEntity;

@RequiredArgsConstructor
public class HolidayPricingStrategy implements PricingStrategy{

    private final PricingStrategy wrapped;

    @Override
    public BigDecimal calculatePrice(InventoryEntity inventory) {
        BigDecimal price = wrapped.calculatePrice(inventory);
        boolean isTodayHoliday = true; // call an API or check with local data
        if (isTodayHoliday) {
            price = price.multiply(BigDecimal.valueOf(1.25));
        }
        return price;
    }
}

