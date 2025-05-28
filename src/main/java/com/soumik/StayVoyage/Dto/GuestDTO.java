package com.soumik.StayVoyage.Dto;

import com.soumik.StayVoyage.Enums.Gender;

import lombok.Data;

@Data
public class GuestDTO {
    private Long id;
    private String name;
    private Gender gender;
    private Integer age;
}
