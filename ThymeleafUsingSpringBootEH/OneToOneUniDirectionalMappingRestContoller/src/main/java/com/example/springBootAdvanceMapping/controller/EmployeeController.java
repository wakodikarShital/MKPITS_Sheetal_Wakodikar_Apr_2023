package com.example.springBootAdvanceMapping.controller;

import com.example.springBootAdvanceMapping.entity.Address;
import com.example.springBootAdvanceMapping.entity.Employee;
import com.example.springBootAdvanceMapping.service.AddressService;
import com.example.springBootAdvanceMapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;
    private AddressService addressService;

    @Autowired
    public EmployeeController(EmployeeService employeeService , AddressService addressService) {
        this.employeeService = employeeService;
        this.addressService=addressService;
    }

    /** ----------------  Insert data in database ---------------------- */

    @GetMapping ("/Employee")
    public Employee save(){
        Address address=new Address("Tandapeth","Nagpur");
        Employee employee = new Employee(101,"Shital",address);
        return employeeService.save(employee);
    }

    /** ----------------  Find particular Employee details from employee id ---------------------- */

    @GetMapping("/findData/{emp_id}")
    public Employee findData(@PathVariable int emp_id){
        return employeeService.findPerticular(emp_id);
    }

    /** ----------------  Find particular address details from address id ---------------------- */

    @GetMapping("/findAddress/{add_id}")
    public Address findaddress(@PathVariable int add_id){
        return addressService.findById(add_id);
    }


    /** ---------------- update particular employee details and address ---------------------- */
    @PostMapping("/update")
    public Employee updateRecord(@RequestBody Employee employee){
        return employeeService.updateRecord(employee);
    }

    /** ---------------- delete particular employee details from address id ---------------------- */
    @PostMapping("/deleteByEmp_Id/{emp_id}")
    public String deleteByEmp_Id(@PathVariable Integer emp_id){
        employeeService.deleteByEmp_Id(emp_id);
        return "Record deleted";
    }


}
