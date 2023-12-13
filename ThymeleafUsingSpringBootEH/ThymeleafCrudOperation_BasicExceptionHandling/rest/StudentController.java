package com.example.SpringBootRestApplication.rest;

import com.example.SpringBootRestApplication.entity.Student;
import com.example.SpringBootRestApplication.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
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
        model.addAttribute("listOfStudent" ,studentList);
        return "listOfStudent";
    }

//---------------- create student ----------------
    @GetMapping("/students")
    public  String save(Model model){
        Student student = new Student();
//        Integer.parseInt(student.getName());
        model.addAttribute("student1" , student);
        return "studentInfo";
    }
//---------------- save student to database ------------------
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student1") Student newStudent){
        /** convert string into integer (Number Format exception)= Integer.parseInt(newStudent.getName());*/
        Integer.parseInt(newStudent.getName());
        studentService.save(newStudent);
        return "redirect:/pagination";
    }

//----------------- update student record ---------------------
    @GetMapping("/updateStudent")
    public String update(@RequestParam("rollno") int roll_Num,Model model){
        Student student = studentService.updateRecord(roll_Num);
        model.addAttribute("student1" , student);
        return "studentInfo";
    }

//---------------- delete student record -------------------
    @GetMapping("/deleteStudent")
    public String delete(@RequestParam("rollno") int roll_Num){
         studentService.delete(roll_Num);
        return "redirect:/pagination";
    }

//----------------- find all student data with pagination ------------------
    @GetMapping("/pagination")
    public String pagination(@PageableDefault(size=5) Pageable pageable, Model model) {
        Page<Student> studentPage = studentService.getPage(pageable);
        model.addAttribute("page", studentPage);
        return "pagination";
    }


//----------------- error page -----------------------
    @ExceptionHandler(value = NumberFormatException.class)
    public String errorPage(){
        return "errorPage";
    }








}
