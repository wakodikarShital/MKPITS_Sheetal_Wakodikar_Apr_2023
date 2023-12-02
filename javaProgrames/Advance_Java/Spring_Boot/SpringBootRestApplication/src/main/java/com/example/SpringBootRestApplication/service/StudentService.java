package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllRecord();
    Student findPerticularRecord(int roll_Number);
    Student saveRecord(Student student);

    Student deleteRecorde(int roll_Number);
    List<Student> insertMultipleRecorde(List<Student> studentList);
}
