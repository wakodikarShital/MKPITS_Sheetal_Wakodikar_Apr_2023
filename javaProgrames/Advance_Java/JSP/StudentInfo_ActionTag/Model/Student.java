package com.example.studentinformationusingjspactiontag.Model;

public class Student {
    private String rollNo;
    private String name;
    private String pin;
    private String city;

    //--------- default constructor ----------------

    public Student() {

    }


    //--------- parameterized constructor ----------------

    public Student(String rollNo, String name, String pin, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.pin = pin;
        this.city = city;
    }


    //------------ getter------------

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getPin() {
        return pin;
    }

    public String getCity() {
        return city;
    }


    //--------- setter---------------

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
