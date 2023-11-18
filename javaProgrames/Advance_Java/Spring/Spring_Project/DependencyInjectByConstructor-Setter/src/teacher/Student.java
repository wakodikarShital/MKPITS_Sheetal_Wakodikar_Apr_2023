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
public class Student {
    private int rollNo;
    private String name;

    public Student() {
    }
    

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "rollNo=" + rollNo + ","
                + "\nname=" + name ;
    }
    
    
    
    
    
    
}
