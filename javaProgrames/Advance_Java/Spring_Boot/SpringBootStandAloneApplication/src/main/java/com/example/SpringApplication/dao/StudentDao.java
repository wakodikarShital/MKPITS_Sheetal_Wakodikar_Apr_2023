package com.example.SpringApplication.dao;

import com.example.SpringApplication.entity.Student;

public interface StudentDao {
    public void save(Student student);
    public Student findByRollNo(Integer roll_Number);
    public void deleteRecord(Student student);
}
