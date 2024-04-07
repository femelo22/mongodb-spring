package com.lfmelo.controllers;


import com.lfmelo.entities.Student;
import com.lfmelo.repositories.StudentRepository;
import com.lfmelo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return ResponseEntity.ok(service.registerStudent(student));
    }

    @GetMapping("/{email}")
    public ResponseEntity<Student> findStudentByEmail(@PathVariable String email) {
        return ResponseEntity.ok(service.getStudentByEmail(email));
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents() {
        return ResponseEntity.ok(service.findAll());
    }

}
