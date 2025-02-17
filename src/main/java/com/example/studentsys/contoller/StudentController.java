package com.example.studentsys.contoller;

import com.example.studentsys.model.Student;
import com.example.studentsys.service.Studentservice;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    @Qualifier("")
    private Studentservice service;

    @GetMapping
    public List<Student> findAllStudent(){
        //todo
        return service.findAllStudents();
    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}
