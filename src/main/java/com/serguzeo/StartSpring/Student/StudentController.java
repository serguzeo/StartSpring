package com.serguzeo.StartSpring.Student;

import com.serguzeo.StartSpring.Student.Services.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final IStudentService IStudentService;

    @GetMapping
    public List<Student> findAllStudents() {
        return IStudentService.findAllStudents();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return IStudentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return IStudentService.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return IStudentService.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public void deleteStudentByEmail(@PathVariable String email) {
        IStudentService.deleteByEmail(email);
    }
}
