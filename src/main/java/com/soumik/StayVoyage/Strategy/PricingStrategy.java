package com.soumik.StayVoyage.Strategy;

import java.math.BigDecimal;

import com.soumik.StayVoyage.Entities.InventoryEntity;
public interface PricingStrategy {

    BigDecimal calculatePrice(InventoryEntity inventory);
}
