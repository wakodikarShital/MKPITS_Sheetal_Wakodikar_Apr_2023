package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllRecord();
    Student findPerticularRecord(int roll_Number);
}
