package com.example.SpringApplication;

import com.example.SpringApplication.dao.StudentDao;
import com.example.SpringApplication.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("hii");
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return  runner->{
			System.out.println("runner");
//			studentDetail(studentDao);
//			readDetails(studentDao);
			deleteDetails(studentDao);
		};
	}

	public void studentDetail(StudentDao studentDao){
		Student student = new Student("Mrunali","Tandapeth","Nagpur");
		studentDao.save(student);
	}
	public Student readDetails(StudentDao studentDao){
		Student student = studentDao.findByRollNo(1);
		System.out.println(student);
		return student;
	}
	public void deleteDetails(StudentDao studentDao) {
//		studentDao.deleteRecord(student);
	}
}
