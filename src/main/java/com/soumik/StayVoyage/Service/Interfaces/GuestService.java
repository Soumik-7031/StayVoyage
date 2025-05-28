package com.soumik.StayVoyage.Service.Interfaces;

import java.util.List;
import com.soumik.StayVoyage.Dto.GuestDTO;

public interface GuestService {

    List<GuestDTO> getAllGuests();

    void updateGuest(Long guestId, GuestDTO guestDto);

    void deleteGuest(Long guestId);

    GuestDTO addNewGuest(GuestDTO guestDto);
}
