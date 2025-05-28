package com.soumik.StayVoyage.Service.Interfaces;

import com.soumik.StayVoyage.Entities.BookingEntity;

public interface CheckoutService {

    String getCheckoutSession(BookingEntity booking, String successUrl, String failureUrl);

}
