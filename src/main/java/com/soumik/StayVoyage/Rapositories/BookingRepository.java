package com.soumik.StayVoyage.Rapositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.soumik.StayVoyage.Entities.BookingEntity;
import com.soumik.StayVoyage.Entities.HotelEntity;
import com.soumik.StayVoyage.Entities.UserEntity;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
    Optional<BookingEntity> findByPaymentSessionId(String sessionId);

    List<BookingEntity> findByHotel(HotelEntity hotel);

    List<BookingEntity> findByHotelAndCreatedAtBetween(HotelEntity hotel, LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<BookingEntity> findByUser(UserEntity user);
}
