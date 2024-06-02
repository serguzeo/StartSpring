package com.serguzeo.StartSpring.Student.Services;

import com.serguzeo.StartSpring.Student.Repositories.StudentRepositoryInMemory;
import com.serguzeo.StartSpring.Student.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceInMemoryImpl implements IStudentService {
    private final StudentRepositoryInMemory repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }
}
