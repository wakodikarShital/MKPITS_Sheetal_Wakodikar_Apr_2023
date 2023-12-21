package com.example.springBootAdvanceMapping;

import com.example.springBootAdvanceMapping.entity.Employee;
import com.example.springBootAdvanceMapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class SpringBootAdvanceMappingApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdvanceMappingApplication.class, args);
	}

//	private EmployeeService employeeService;
//	@Autowired
//	public SpringBootAdvanceMappingApplication(EmployeeService employeeService) {
//		this.employeeService = employeeService;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		findData(102);
//	}
//
//	public Employee findData(int emp_id){
//		Employee employee= employeeService.findPerticular(emp_id);
//		System.out.println(employee);
//		return employee;
//	}
}
