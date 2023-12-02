package com.example.SpringBootRestApplication.dao;

import com.example.SpringBootRestApplication.entity.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> findAll();
    public Student findPerticularData(int roll_Number);
    public Student save(Student student);
    public Student delete(int roll_Number);
    public List<Student> inserMultiple(List<Student> studentList);

}
