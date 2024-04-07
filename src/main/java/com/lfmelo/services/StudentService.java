package com.lfmelo.services;

import com.lfmelo.entities.Student;

import java.util.List;

public interface StudentService {

    Student registerStudent(Student student);

    Student getStudentByEmail(String email);

    List<Student> findAll();
}
