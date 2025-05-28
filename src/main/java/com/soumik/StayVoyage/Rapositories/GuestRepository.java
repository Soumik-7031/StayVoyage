package com.soumik.StayVoyage.Rapositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soumik.StayVoyage.Dto.GuestDTO;
import com.soumik.StayVoyage.Entities.GuestEntity;
import com.soumik.StayVoyage.Entities.UserEntity;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Long> {
    List<GuestDTO> findByUser(UserEntity user);
}
