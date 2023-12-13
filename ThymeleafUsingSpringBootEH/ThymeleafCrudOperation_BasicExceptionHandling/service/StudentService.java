package com.example.SpringBootRestApplication.service;

import com.example.SpringBootRestApplication.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student save(Student student);
    Student updateRecord(Integer rollno);

    void delete(Integer rollno);
    Page<Student> getPage(Pageable pageable);




}
