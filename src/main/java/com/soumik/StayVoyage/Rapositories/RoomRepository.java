package com.soumik.StayVoyage.Rapositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.soumik.StayVoyage.Entities.RoomEntity;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity,Long> {
}

