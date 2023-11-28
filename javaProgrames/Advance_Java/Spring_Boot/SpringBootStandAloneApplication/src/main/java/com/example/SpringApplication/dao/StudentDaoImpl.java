package com.example.SpringApplication.dao;

import com.example.SpringApplication.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao{
    private EntityManager entityManager;
    @Autowired
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);

    }

    @Override
    @Transactional
    public Student findByRollNo(Integer roll_Number){
        return entityManager.find(Student.class,1);


    }

   @Override
    @Transactional
    public void deleteRecord(Student student){
        entityManager.remove(student);

    }



}
