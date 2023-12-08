package com.example.SpringBootRestApplication.rest;

import com.example.SpringBootRestApplication.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/infoForm")
    public String form(Model model){
        Student student = new Student();
        model.addAttribute("students",student);
        return "info";
    }

    @GetMapping("/process")
      public String processData(@Valid @ModelAttribute ("students") Student theStudent , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "info";
        }else {
            return "processData";
        }
    }







}
