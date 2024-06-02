package com.serguzeo.StartSpring.Student;


import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    private UUID uuid;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }



    public Student() {
        this.uuid = UUID.randomUUID(); // Генерация UUID при создании экземпляра класса
    }

}
