package com.soumik.StayVoyage.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.soumik.StayVoyage.Dto.BookingDTO;
import com.soumik.StayVoyage.Dto.HotelDTO;
import com.soumik.StayVoyage.Dto.HotelReportDTO;
import com.soumik.StayVoyage.Service.Interfaces.BookingService;
import com.soumik.StayVoyage.Service.Interfaces.HotelService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/admin/hotels")
@RequiredArgsConstructor
@Slf4j
@SecurityRequirement(name = "BearerAuth")
@Tag(name = "Hotel Management", description = "Manage hotel details")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @Autowired
    private BookingService bookingService;

    @PostMapping
    @Operation(summary = "Create a new hotel", description = "Adds a new hotel to the system")
    public ResponseEntity<HotelDTO> createNewHotel(@RequestBody HotelDTO hotelDto) {
        log.info("Attempting to create a new hotel with name: "+hotelDto.getName());
        HotelDTO hotel = hotelService.createNewHotel(hotelDto);
        return new ResponseEntity<>(hotel, HttpStatus.CREATED);
    }

    @GetMapping("/{hotelId}")
    @Operation(summary = "Get hotel by ID", description = "Fetch details of a specific hotel")
    public ResponseEntity<HotelDTO> getHotelById(@PathVariable Long hotelId) {
        HotelDTO hotelDto = hotelService.getHotelById(hotelId);
        return ResponseEntity.ok(hotelDto);
    }

    @PutMapping("/{hotelId}")
    @Operation(summary = "Update hotel details", description = "Modify hotel information")
    public ResponseEntity<HotelDTO> updateHotelById(@PathVariable Long hotelId, @RequestBody HotelDTO hotelDto) {
        HotelDTO hotel = hotelService.updateHotelById(hotelId, hotelDto);
        return ResponseEntity.ok(hotel);
    }

    @DeleteMapping("/{hotelId}")
    @Operation(summary = "Delete a hotel", description = "Removes a hotel from the system")
    public ResponseEntity<Void> deleteHotelById(@PathVariable Long hotelId) {
        hotelService.deleteHotelById(hotelId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{hotelId}/activate")
    @Operation(summary = "Activate a hotel", description = "Marks a hotel as active")
    public ResponseEntity<Void> activateHotel(@PathVariable Long hotelId) {
        hotelService.activateHotel(hotelId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    @Operation(summary = "Get all hotels owned by admin",description = "Retrieve a list of all hotels owned by the admin")
    public ResponseEntity<List<HotelDTO>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }

    @GetMapping("/{hotelId}/bookings")
    @Operation(summary = "Get all bookings of a hotel", description = "Fetches all bookings related to a specific hotel", tags = {"Booking Flow"})
    public ResponseEntity<List<BookingDTO>> getAllBookingsByHotelId(@PathVariable Long hotelId) {
        return ResponseEntity.ok(bookingService.getAllBookingsByHotelId(hotelId));
    }

    @GetMapping("/{hotelId}/reports")
    @Operation(summary = "Generate a hotel booking report",description = "Generates a report for hotel bookings within a date range", tags = {"Booking Flow"})
    public ResponseEntity<HotelReportDTO> getHotelReport(@PathVariable Long hotelId,
                                                         @RequestParam(required = false) LocalDate startDate,
                                                         @RequestParam(required = false) LocalDate endDate) {

        if (startDate == null) startDate = LocalDate.now().minusMonths(1);
        if (endDate == null) endDate = LocalDate.now();

        return ResponseEntity.ok(bookingService.getHotelReport(hotelId, startDate, endDate));
    }

}

