package com.example.SpringBootRestApplication.dao;

import com.example.SpringBootRestApplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
