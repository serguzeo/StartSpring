package com.serguzeo.StartSpring.Student.Repositories;

import com.serguzeo.StartSpring.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IStudentRepository extends JpaRepository<Student, UUID> {
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
