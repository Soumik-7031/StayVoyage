package com.soumik.StayVoyage.Service.Interfaces;

import com.soumik.StayVoyage.Dto.ProfileUpdateRequestDTO;
import com.soumik.StayVoyage.Dto.UserDTO;
import com.soumik.StayVoyage.Entities.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
