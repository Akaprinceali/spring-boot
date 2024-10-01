package com.te.ems.entity;

import com.te.ems.entity.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Employee {
    @Id
    private String id;

    @Column(unique = true)
    private String employeeId;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoin;
    private Double salary;

    @Enumerated
    private Gender gender;
}