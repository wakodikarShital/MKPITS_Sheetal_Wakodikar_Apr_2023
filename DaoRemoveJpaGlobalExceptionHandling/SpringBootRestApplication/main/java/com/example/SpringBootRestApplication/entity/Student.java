package com.example.SpringBootRestApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
public class Student {
    @Id
    private int roll_Number;
    private String name;
    private String city;
    private String address;

    public Student() {
    }

    public Student(int roll_Number, String name, String city, String address) {
        this.roll_Number = roll_Number;
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public int getRollNumber() {
        return roll_Number;
    }

    public void setRollNumber(int roll_Number) {
        this.roll_Number = roll_Number;
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
}
