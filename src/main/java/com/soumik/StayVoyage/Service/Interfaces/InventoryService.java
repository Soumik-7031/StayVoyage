package com.soumik.StayVoyage.Service.Interfaces;

import java.util.List;

import org.springframework.data.domain.Page;

import com.soumik.StayVoyage.Dto.HotelPriceDTO;
import com.soumik.StayVoyage.Dto.HotelSearchRequest;
import com.soumik.StayVoyage.Dto.InventoryDTO;
import com.soumik.StayVoyage.Dto.UpdateInventoryRequestDTO;
import com.soumik.StayVoyage.Entities.RoomEntity;

public interface InventoryService {
    void initializeRoomForAYear(RoomEntity room);

    void deleteAllInventories(RoomEntity room);

    Page<HotelPriceDTO> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDTO> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDTO updateInventoryRequestDto);
}
