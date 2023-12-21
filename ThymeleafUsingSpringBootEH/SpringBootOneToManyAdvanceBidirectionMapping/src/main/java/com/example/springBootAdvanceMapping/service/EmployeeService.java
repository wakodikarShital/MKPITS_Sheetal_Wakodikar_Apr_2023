package com.example.springBootAdvanceMapping.service;

import com.example.springBootAdvanceMapping.entity.Employee;

public interface EmployeeService {
    public Employee save(Employee employee);
    public Employee findPerticular(Integer emp_id);
    Employee updateRecord(Employee employee);
    String deleteByEmp_Id(Integer emp_Id);


}
