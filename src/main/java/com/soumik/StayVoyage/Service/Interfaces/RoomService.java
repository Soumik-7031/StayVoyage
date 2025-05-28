package com.soumik.StayVoyage.Service.Interfaces;

import java.util.List;

import com.soumik.StayVoyage.Dto.RoomDTO;

public interface RoomService {
    RoomDTO createNewRoom(Long hotelId, RoomDTO roomDto);

    List<RoomDTO> getAllRoomsInHotel(Long hotelId);

    RoomDTO getRoomById(Long roomId);

    void deleteRoomById(Long roomId);

    RoomDTO updateRoomById(Long hotelId, Long roomId, RoomDTO roomDto);
}
