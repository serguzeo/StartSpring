package com.serguzeo.StartSpring.Student.Services;

import com.serguzeo.StartSpring.Student.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudents();

    Student saveStudent(Student student);

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteByEmail(String email);

}
