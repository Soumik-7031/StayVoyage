package com.soumik.StayVoyage.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.soumik.StayVoyage.Enums.Gender;

@Entity
@Setter
@Getter
@Table(name = "Guest")
public class GuestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    private Integer age;

/*    @ManyToMany(mappedBy = "guests")
    private Set<BookingEntity> bookings;*/

}

