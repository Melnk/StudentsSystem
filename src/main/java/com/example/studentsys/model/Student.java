package com.example.studentsys.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.*;

@Data //Содержит все нужны аннотации (Getter, Setter, Constructor)
@Entity
@Table(name = "students")   
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;
}
