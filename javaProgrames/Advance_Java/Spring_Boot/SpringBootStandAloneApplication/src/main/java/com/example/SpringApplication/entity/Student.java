package com.example.SpringApplication.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Student {

    @Id
    private int roll_Number;


    private String name;


    private String address;


    private String city;

    public Student() {
    }

    public Student(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_Number=" + roll_Number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
