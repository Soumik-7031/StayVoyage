package com.soumik.StayVoyage.Dto;

import lombok.Data;
import java.time.LocalDate;
import com.soumik.StayVoyage.Enums.Gender;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
