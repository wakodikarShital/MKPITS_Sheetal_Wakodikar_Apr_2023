package com.example.SpringBootRestApplication.dao;

import com.example.SpringBootRestApplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="learners")
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
