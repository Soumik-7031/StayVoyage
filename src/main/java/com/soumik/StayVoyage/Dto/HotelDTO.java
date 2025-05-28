package com.soumik.StayVoyage.Dto;

import lombok.Data;
import com.soumik.StayVoyage.Entities.HotelContactInfo;

@Data
public class HotelDTO {
    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;
}
