package com.soumik.StayVoyage.Rapositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soumik.StayVoyage.Entities.UserEntity;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
