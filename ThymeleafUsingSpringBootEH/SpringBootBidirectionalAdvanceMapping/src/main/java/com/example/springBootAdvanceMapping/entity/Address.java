package com.example.springBootAdvanceMapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_address_details")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int address_id;
    private String address;
    private String city;

    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Employee employee;

    public Address() {
    }

    public Address(String address, String city , Employee employee) {
        this.address = address;
        this.city = city;
        this.employee=employee;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
