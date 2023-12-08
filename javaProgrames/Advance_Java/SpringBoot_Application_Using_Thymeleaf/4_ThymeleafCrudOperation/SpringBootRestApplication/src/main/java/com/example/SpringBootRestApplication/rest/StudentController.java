package com.example.SpringBootRestApplication.rest;

import com.example.SpringBootRestApplication.entity.Student;
import com.example.SpringBootRestApplication.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


// crud operation
//---------------- find all student --------------
    @GetMapping("/StudentList")
    public String displayStudentList(Model model){
        List<Student> studentList = studentService.findAllStudents();
        model.addAttribute("listOfStudent" , studentList);
        return "listOfStudent";
    }

//---------------- create student ----------------
    @GetMapping("/students")
    public  String save(Model model){
        Student student = new Student();
        model.addAttribute("student1" , student);
        return "studentInfo";
    }
//---------------- save student to database ------------------
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student1") Student newStudent){
        studentService.save(newStudent);
        return "redirect:/StudentList";
    }

//-----------------------












}
