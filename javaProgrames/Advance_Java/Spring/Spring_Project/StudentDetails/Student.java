/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDetails;

/**
 *
 * @author LENOVO
 */
public class Student {
    
    private int rollNo;
    private String name;
    private String city;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Student(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }
    
    
    public void displayInfo(){
        System.out.println("Student Details ------------");
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("City = " + city);
        
    }
    
}
