package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.dao.StudentRepository;
import com.example.SpringBootRestApplication.entity.Student;
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
         return studentOptional.get();
    }

    @Override
    @Transactional
    public Student saveRecord(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public Student updateRecord(Integer roll_Number,Student student) {
        Optional<Student> studentOptional = studentRepository.findById(roll_Number);
        if(studentOptional.isPresent()){
            student = studentOptional.get();
            studentRepository.save(student);
        }else {
            System.out.println("Data Not Fetch");
        }
        return student;
    }

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

    @Override
    @Transactional
    public List<Student> insertMultipleRecorde(List<Student> studentList) {
      return studentRepository.saveAll(studentList);
    }

    @Override
    @Transactional
    public List<Student> insertMultipleRecorde(List<Student> studentList) {
        return studentRepository.saveAll(studentList);
    }
}
