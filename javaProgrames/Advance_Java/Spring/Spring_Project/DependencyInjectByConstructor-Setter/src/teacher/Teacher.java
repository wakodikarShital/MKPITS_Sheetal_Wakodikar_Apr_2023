/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

/**
 *
 * @author LENOVO
 */
public class Teacher {
    private int id;
    private String name;
    private Student student;

    
    
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void displayDetails(){
        System.out.println("-------------- Teacher Details ------------");
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("-------------- Student Details -------------");
        System.out.println(student);
          
    }
   
}
