package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.dao.StudentRepository;
import com.example.SpringBootRestApplication.entity.Student;
import com.example.SpringBootRestApplication.exceptionHandling.Record_NotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }

    @Override
    public List<Student> findAllRecord() {
        return studentRepository.findAll();
    }


    @Override
    public Student findPerticularRecord(Integer roll_Number) {
        Optional<Student> studentOptional= studentRepository.findById(roll_Number);
        if(studentOptional.isEmpty())
            throw new Record_NotFoundException("Record Not Found");
         return studentOptional.get();
    }

    @Override
    @Transactional
    public Student saveRecord(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public Student updateRecord(Student student) {
        Optional<Student> studentOptional = studentRepository.findById(student.getRollNumber());
        if(studentOptional.isPresent()){
            studentRepository.save(student);
        }else {
            System.out.println("Data not fetch");
        }
        return student;
    }

    //--------- 04/12/23 -----------


    @Override
    @Transactional
    public String updateMultiple(Student student) {
        List<Student> studentList = new ArrayList<>();
        for(int counter=0;counter<=studentList.size();counter++ ) {
            studentList.add(student);
        }
       Optional<Student> optionalStudent = studentRepository.findById(student.getRollNumber());
       if (optionalStudent.isPresent()){
           studentRepository.saveAll(studentList);
           return "Updated";
       }else {
           return "Data not found";
       }
    }


    @Override
    @Transactional
    public String deleteRecorde(Integer roll_Number) {
         studentRepository.deleteById(roll_Number);
         return "Successfully deleted";

    }

    //----------- 04/12/23------------
    @Override
    @Transactional
    public List<Student> insertMultipleRecorde(List<Student> studentList) {
        return studentRepository.saveAll(studentList);
    }
}
