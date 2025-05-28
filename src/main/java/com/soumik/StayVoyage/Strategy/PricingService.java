package com.soumik.StayVoyage.Strategy;

import org.springframework.stereotype.Service;

import com.soumik.StayVoyage.Entities.InventoryEntity;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PricingService {

    public BigDecimal calculateDynamicPricing(InventoryEntity inventory) {
        PricingStrategy pricingStrategy = new BasePricingStrategy();

        // apply the additional strategies
        pricingStrategy = new SurgePricingStrategy(pricingStrategy);
        pricingStrategy = new OccupancyPricingStrategy(pricingStrategy);
        pricingStrategy = new UrgencyPricingStrategy(pricingStrategy);
        pricingStrategy = new HolidayPricingStrategy(pricingStrategy);

        return pricingStrategy.calculatePrice(inventory);
    }

    //    Return the sum of price of this inventory list
    public BigDecimal calculateTotalPrice(List<InventoryEntity> inventoryList) {
        return inventoryList.stream()
                .map(this::calculateDynamicPricing)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

