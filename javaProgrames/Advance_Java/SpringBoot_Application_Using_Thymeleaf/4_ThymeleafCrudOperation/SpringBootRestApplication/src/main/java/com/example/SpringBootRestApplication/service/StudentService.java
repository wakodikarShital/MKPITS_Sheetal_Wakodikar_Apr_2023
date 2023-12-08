package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student save(Student student);

}
