package com.soumik.StayVoyage.Service.Interfaces;

import java.time.LocalDate;
import java.util.List;

import com.soumik.StayVoyage.Dto.BookingDTO;
import com.soumik.StayVoyage.Dto.BookingRequest;
import com.soumik.StayVoyage.Dto.GuestDTO;
import com.soumik.StayVoyage.Dto.HotelReportDTO;
import com.soumik.StayVoyage.Enums.BookingStatus;
import com.stripe.model.Event;

public interface BookingService {
    BookingDTO initialiseBooking(BookingRequest bookingRequest);

    BookingDTO addGuests(Long bookingId, List<GuestDTO> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDTO> getAllBookingsByHotelId(Long hotelId);

    HotelReportDTO getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDTO> getMyBookings();
}

