package com.example.studentsys.impl;

import com.example.studentsys.model.Student;
import com.example.studentsys.repository.InMemoryStudentDAO;
import com.example.studentsys.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO inMemoryStudentDAO;
    @Override
    public List<Student> findAllStudents() {
        return inMemoryStudentDAO.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return inMemoryStudentDAO.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDAO.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return inMemoryStudentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        inMemoryStudentDAO.deleteStudent(email);
    }
}
