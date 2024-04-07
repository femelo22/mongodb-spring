package com.lfmelo.services.impl;

import com.lfmelo.entities.Student;
import com.lfmelo.exceptions.BusinessException;
import com.lfmelo.repositories.StudentRepository;
import com.lfmelo.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student registerStudent(Student student) {
        log.info("Saving student {}", student);
        return repository
                .save(student);
    }

    @Override
    public Student getStudentByEmail(String email) {
        log.info("Find student by email: {}", email);
        return repository
                .findStudentByEmail(email)
                .orElseThrow(() -> new BusinessException("Student not found!"));
    }

    @Override
    public List<Student> findAll() {
        return repository
                .findAll();
    }
}
