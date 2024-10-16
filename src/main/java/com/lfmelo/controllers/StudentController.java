package com.lfmelo.controllers;


import com.lfmelo.entities.Student;
import com.lfmelo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        List<int[]> memoryHog = new ArrayList<>();
        int arraySize = 100_000; // Tamanho de cada array (100.000 elementos)
        int totalArrays = 6;      // Número total de arrays para chegar a 600 MB

        // Alocando memória
        for (int i = 0; i < totalArrays; i++) {
            int[] array = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                System.out.println("Passou aqui " + j);
                array[j] = j; // Preenchendo o array para garantir a alocação
            }
            memoryHog.add(array);
            System.out.println("Alocado array " + (i + 1));
        }

        System.out.println("Pressione Enter para sair...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(service.getStudentByEmail(email));
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents() {
        return ResponseEntity.ok(service.findAll());
    }

}
