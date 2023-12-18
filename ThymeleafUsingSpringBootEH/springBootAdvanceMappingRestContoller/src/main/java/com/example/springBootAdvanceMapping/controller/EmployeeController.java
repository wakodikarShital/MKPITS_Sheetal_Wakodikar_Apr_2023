package com.example.springBootAdvanceMapping.controller;

import com.example.springBootAdvanceMapping.entity.Address;
import com.example.springBootAdvanceMapping.entity.Employee;
import com.example.springBootAdvanceMapping.service.AddressService;
import com.example.springBootAdvanceMapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;
    private AddressService addressService;

    @Autowired
    public EmployeeController(EmployeeService employeeService , AddressService addressService) {
        this.employeeService = employeeService;
        this.addressService=addressService;
    }

    @GetMapping ("/Employee")
    public Employee save(){
        Address address=new Address("Tandapeth","Nagpur");
        Employee employee = new Employee(101,"Shital",address);
        return employeeService.save(employee);
    }

    @GetMapping("/findData/{emp_id}")
    public Employee findData(@PathVariable int emp_id){
        return employeeService.findPerticular(emp_id);
    }

    @GetMapping("/findAddress/{add_id}")
    public Address findaddress(@PathVariable int add_id){
        return addressService.findById(add_id);
    }


}
