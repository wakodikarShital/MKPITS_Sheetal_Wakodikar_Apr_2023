package com.example.springBootAdvanceMapping.repository;

import com.example.springBootAdvanceMapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
