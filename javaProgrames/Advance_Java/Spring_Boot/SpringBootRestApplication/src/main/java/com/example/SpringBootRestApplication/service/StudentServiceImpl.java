package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.dao.StudentDaoImpl;
import com.example.SpringBootRestApplication.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentDaoImpl studentDaoImpl;

    @Autowired
    public StudentServiceImpl(StudentDaoImpl studentDaoImpl) {
        this.studentDaoImpl=studentDaoImpl;
    }

    @Override
    public List<Student> findAllRecord() {
        return studentDaoImpl.findAll();
    }


    @Override
    public Student findPerticularRecord(int roll_Number) {
        return studentDaoImpl.findPerticularData(roll_Number);
    }
}
