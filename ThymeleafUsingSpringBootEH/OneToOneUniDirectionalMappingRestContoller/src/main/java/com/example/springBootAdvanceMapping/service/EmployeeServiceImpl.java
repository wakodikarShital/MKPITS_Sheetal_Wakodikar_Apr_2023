package com.example.springBootAdvanceMapping.service;

import com.example.springBootAdvanceMapping.entity.Employee;
import com.example.springBootAdvanceMapping.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Autowired

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository=employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public Employee findPerticular(Integer emp_id) {
       return employeeRepository.findById(emp_id).get();
    }

    @Override
    public Employee findPerticular(Integer emp_id) {
        return employeeRepository.findById(emp_id).get();
    }

    @Override
    public Employee updateRecord(Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(employee.getEmployee_id());
        if(employeeOptional.isPresent()){
            employeeRepository.save(employee);
        }else {
            System.out.println("Data not fetch");
        }
        return employee;
    }

    @Override
    public String deleteByEmp_Id(Integer emp_Id) {
        employeeRepository.deleteById(emp_Id);
        return "Record deleted" ;
    }
}
