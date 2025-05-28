package com.soumik.StayVoyage.Strategy;

import lombok.RequiredArgsConstructor;
import java.math.BigDecimal;

import com.soumik.StayVoyage.Entities.InventoryEntity;

@RequiredArgsConstructor
public class OccupancyPricingStrategy implements PricingStrategy{

    private final PricingStrategy wrapped;

    @Override
    public BigDecimal calculatePrice(InventoryEntity inventory) {
        BigDecimal price = wrapped.calculatePrice(inventory);
        double occupancyRate = (double) inventory.getBookCount() / inventory.getTotalCount();
        if(occupancyRate > 0.8) {
            price = price.multiply(BigDecimal.valueOf(1.2));
        }
        return price;
    }
}
