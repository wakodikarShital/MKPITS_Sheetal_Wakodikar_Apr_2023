package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAllRecord();
    Student findPerticularRecord(Integer roll_Number);
    Student saveRecord(Student student);
    Student updateRecord(Integer roll_Number,Student student);

    String updateMultiple(Student student);
    String deleteRecorde(Integer roll_Number);
    List<Student> insertMultipleRecorde(List<Student> studentList);

}
