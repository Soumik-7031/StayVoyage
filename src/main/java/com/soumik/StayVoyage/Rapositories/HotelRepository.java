package com.soumik.StayVoyage.Rapositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.soumik.StayVoyage.Entities.HotelEntity;
import com.soumik.StayVoyage.Entities.UserEntity;
import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
    List<HotelEntity> findByOwner(UserEntity user);
}

