package com.soumik.StayVoyage.Strategy;

import java.math.BigDecimal;

import com.soumik.StayVoyage.Entities.InventoryEntity;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(InventoryEntity inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
