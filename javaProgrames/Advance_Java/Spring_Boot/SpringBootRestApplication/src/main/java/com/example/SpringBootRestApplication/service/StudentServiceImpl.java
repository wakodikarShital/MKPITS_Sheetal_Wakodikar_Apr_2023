package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.dao.StudentDaoImpl;
import com.example.SpringBootRestApplication.entity.Student;
import jakarta.transaction.Transactional;
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

    @Override
    @Transactional
    public Student saveRecord(Student student) {
        return studentDaoImpl.save(student);
    }

    @Override
    @Transactional
    public Student deleteRecorde(int roll_Number) {
        return studentDaoImpl.delete(roll_Number);
    }

    @Override
    @Transactional
    public List<Student> insertMultipleRecorde(List<Student> studentList) {
        return studentDaoImpl.inserMultiple(studentList);
    }
}
