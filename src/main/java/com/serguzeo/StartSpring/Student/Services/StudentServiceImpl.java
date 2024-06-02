package com.serguzeo.StartSpring.Student.Services;

import com.serguzeo.StartSpring.Student.Repositories.IStudentRepository;
import com.serguzeo.StartSpring.Student.Student;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements IStudentService {
    private final IStudentRepository repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }
}
