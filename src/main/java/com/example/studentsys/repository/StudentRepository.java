package com.example.studentsys.repository;

import com.example.studentsys.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteStudentByEmail(String email);
    Student findStudentByEmail(String email);
}
