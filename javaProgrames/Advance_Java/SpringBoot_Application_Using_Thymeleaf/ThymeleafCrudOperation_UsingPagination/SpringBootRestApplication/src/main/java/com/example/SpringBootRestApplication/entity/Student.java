package com.example.SpringBootRestApplication.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
public class Student {
    @Id
    @Column(name="roll_Number")
    private int rollno;
    private String name;
    private String city;
    private String address;

    public Student() {
    }

    public Student(int rollno, String name, String city, String address) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_Number= " + rollno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
