package com.example.SpringBootRestApplication.rest;

import com.example.SpringBootRestApplication.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @RequestMapping ("/hello")
    public String display(Model model){
        model.addAttribute("name","Shital Wakodikar");
        return "hello";
    }

    @GetMapping("/infoForm")
    public String form(Model model){
//        List<Student> studentList = new ArrayList<>();
//        model.addAttribute("students",studentList);
        return "info";
    }

    @GetMapping("/process")
      public String processData(HttpServletRequest request , Model model){
        String rollNumber= request.getParameter("roll_number");
        String name=request.getParameter("name");
        String city=request.getParameter("city");
        String address=request.getParameter("address");

        model.addAttribute("rollNumber",rollNumber);
        model.addAttribute("name",name);
        model.addAttribute("city",city);
        model.addAttribute("address",address);

        return "processData";
    }

    @GetMapping("/getStudents")
    public String displayStudents(Model model){
        Student student = new Student(1,"Nikhil","Nagpur","Tandapeth");

        model.addAttribute("students",student);
        return "displayStudent";
    }


}
