package com.lfmelo.controllers;


import com.lfmelo.entities.Student;
import com.lfmelo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository repository;

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        System.out.println("Passou aqui: " + student);
        Student save = repository.save(student);
        System.out.println(save);
    }
}
