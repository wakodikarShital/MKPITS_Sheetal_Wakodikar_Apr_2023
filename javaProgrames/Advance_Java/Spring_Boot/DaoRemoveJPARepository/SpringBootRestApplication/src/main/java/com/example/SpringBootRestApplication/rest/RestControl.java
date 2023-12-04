package com.example.SpringBootRestApplication.rest;

import com.example.SpringBootRestApplication.entity.Student;
import com.example.SpringBootRestApplication.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControl {
    private StudentServiceImpl studentService;

    @Autowired
    public RestControl(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/studentList")
    public List<Student> findAllStudentDetails(){
        return studentService.findAllRecord();
    }

    @GetMapping("/getParticularList/{roll_Number}")
    public Student findParticularRecord(@PathVariable int roll_Number){
        return studentService.findPerticularRecord(roll_Number);
    }

    /** we can do as it is also get particular record */
//    @GetMapping("/getParticularList")
//    public Student findParticularRecord(){
//        return studentService.findPerticularRecord(1);
//    }

// for use update and insert only
    @PostMapping("/Student")
    public Student insertRecord(@RequestBody Student student){
        return studentService.saveRecord(student);
    }

    @PostMapping("/insertMultiple")
    public List<Student> insertMultipleRecords(@RequestBody List<Student> studentList){
      return studentService.insertMultipleRecorde(studentList);

    }

    @PostMapping("/update")
    public Student updateRecord(@RequestBody Integer roll_Number){
        return studentService.updateRecord(roll_Number,new Student());
    }

    @PostMapping("/updateMultiple")
    public String updateMultipleRecords(@RequestBody Student student){
        return studentService.updateMultiple(student);
    }

    @DeleteMapping("/Student/{roll_Number}")
    public String deleteRecords(@PathVariable int roll_Number){
         studentService.deleteRecorde(roll_Number);
         return "Deleted Successfully";
    }

    @GetMapping("/Student")
    public List<Student> getStudent(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101,"Shital","nagpur","Tandapeth"));
        studentList.add(new Student(102,"Suchi ","indore","panchpoli"));
        return studentList;
    }



    @GetMapping("/getStudent/{studentId}")
    public Student  getDetails(@PathVariable int studentId){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101,"Shital","nagpur","Tandapeth"));
        studentList.add(new Student(102,"Suchi ","indore","panchpoli"));
       return studentList.get(studentId);

    }
}
