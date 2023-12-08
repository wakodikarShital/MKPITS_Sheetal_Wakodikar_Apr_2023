package com.example.SpringBootRestApplication.rest;

import com.example.SpringBootRestApplication.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/infoForm")
    public String form(Model model){
//        Student student = new Student();
//        model.addAttribute("students",student);
        return "info";
    }

    @GetMapping("/process")
      public String processData(@RequestParam("roll_no") String rollNo,
                                @RequestParam("name") String name,
                                @RequestParam("city") String city,
                                @RequestParam("address") String address,Model model){

        // attributeName are same as feild

        model.addAttribute("roll_Number" ,rollNo);
        model.addAttribute("name" ,name);
        model.addAttribute("city" ,city);
        model.addAttribute("address" ,address);


        return "processData";
    }







}
