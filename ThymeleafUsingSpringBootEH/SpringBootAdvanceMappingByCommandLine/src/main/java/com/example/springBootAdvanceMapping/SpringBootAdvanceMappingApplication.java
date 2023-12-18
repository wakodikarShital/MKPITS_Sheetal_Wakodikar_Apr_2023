package com.example.springBootAdvanceMapping;

import com.example.springBootAdvanceMapping.entity.Address;
import com.example.springBootAdvanceMapping.entity.Employee;
import com.example.springBootAdvanceMapping.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAdvanceMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdvanceMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		save();
	}
	private EmployeeService employeeService;

	public SpringBootAdvanceMappingApplication(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Employee save(){
		Address address=new Address("Tandapeth","Nagpur");
		Employee employee = new Employee(104,"rani",address);
		return employeeService.save(employee);

	}
}
