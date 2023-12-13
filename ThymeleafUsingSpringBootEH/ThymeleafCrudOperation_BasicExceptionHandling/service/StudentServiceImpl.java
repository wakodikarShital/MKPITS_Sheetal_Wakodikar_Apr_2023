package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.dao.StudentRepository;
import com.example.SpringBootRestApplication.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

//    @Override
//    public Student findById(Integer roll_no) {
//      Optional<Student> student=  studentRepository.findById(roll_no);
//      return student.get();
//    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public Student updateRecord(Integer rollno) {
        Optional<Student> optionalStudent = studentRepository.findById(rollno);
        return optionalStudent.get();
    }

    @Override
    public void delete(Integer rollno) {
       Student student=studentRepository.findById(rollno).get();
       studentRepository.delete(student);
    }

//---------------- Paggination ---------------------

    @Override
    public Page<Student> getPage(Pageable pageable) {
        return this.studentRepository.findAll(pageable);

    }
}
