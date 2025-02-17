package com.example.studentsys.impl;

import com.example.studentsys.model.Student;
import com.example.studentsys.repository.StudentRepository;
import com.example.studentsys.service.Studentservice;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements Studentservice {

    private final StudentRepository repository;

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
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteStudentByEmail(email);
    }
}
