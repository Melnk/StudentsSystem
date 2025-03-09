package com.example.studentsys.service;

import com.example.studentsys.model.Student;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
