package StudentModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Student {
    private String rollno;
    private String nameOfStudent;
    private String pin;
    private String city;
    
    //----------- default constructor ----------------------------
    
    public Student(){
        
    }
    
    //------------ paremeterize constructor -----------------------
    
    public Student(String rollno,String nameOfStudent,String pin,String city){
        this.rollno=rollno;
        this.nameOfStudent=nameOfStudent;
        this.pin=pin;
        this.city=city;
    }

    //---------- getter-----------------------
    
    public String getRollno() {
        return rollno;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public String getPin() {
        return pin;
    }

    public String getCity() {
        return city;
    }

    
    //------------------- setter -------------------------
    
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    
    
}
