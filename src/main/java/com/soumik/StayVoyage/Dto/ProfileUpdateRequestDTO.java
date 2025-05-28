package com.soumik.StayVoyage.Dto;

import lombok.Data;
import java.time.LocalDate;
import com.soumik.StayVoyage.Enums.Gender;

@Data
public class ProfileUpdateRequestDTO {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
