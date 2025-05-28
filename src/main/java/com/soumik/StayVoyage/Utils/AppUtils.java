package com.soumik.StayVoyage.Utils;

import org.springframework.security.core.context.SecurityContextHolder;

import com.soumik.StayVoyage.Entities.UserEntity;

public class AppUtils {

    public static UserEntity getCurrentUser() {
        return (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
