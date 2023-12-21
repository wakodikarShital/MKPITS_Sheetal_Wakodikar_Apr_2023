package com.example.springBootAdvanceMapping.controller;

import com.example.springBootAdvanceMapping.entity.Address;
import com.example.springBootAdvanceMapping.entity.Employee;
import com.example.springBootAdvanceMapping.entity.Project;
import com.example.springBootAdvanceMapping.service.AddressService;
import com.example.springBootAdvanceMapping.service.EmployeeService;
import com.example.springBootAdvanceMapping.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;
    private AddressService addressService;
    private ProjectService projectService;

    @Autowired
    public EmployeeController(EmployeeService employeeService , AddressService addressService , ProjectService projectService) {
        this.employeeService = employeeService;
        this.addressService=addressService;
        this.projectService=projectService;
    }

/** ----------------  Insert data in database ---------------------- */

    @PostMapping ("/Employee")
    public Employee save(@RequestBody Employee employee){
//        Address address=new Address("Tandapeth","Nagpur");
//        Employee employee1 = new Employee(104,"Shital",address);
//        List<Project> projectList = new ArrayList<>();
//        Project project1 = new Project(7,"school management");
//        Project project2 = new Project(8,"cricket management");
//        projectList.add(project1);
//        projectList.add(project2);
//        employee1.setProjectList(projectList);

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
    @DeleteMapping("/deleteByEmp_Id/{emp_id}")
    public String deleteByEmp_Id(@PathVariable Integer emp_id){
        employeeService.deleteByEmp_Id(emp_id);
        return "Record deleted";
    }

/** ---------------- Find particular employee details from course id ---------------------- */
    @GetMapping("/Employee/{course_id}")
    public Employee FindEmployeeDetailsOnCourseId(@PathVariable int course_id ){
       Employee employee= projectService.findByCourseId(course_id);
        System.out.println(employee);
       return employee;

    }
}
