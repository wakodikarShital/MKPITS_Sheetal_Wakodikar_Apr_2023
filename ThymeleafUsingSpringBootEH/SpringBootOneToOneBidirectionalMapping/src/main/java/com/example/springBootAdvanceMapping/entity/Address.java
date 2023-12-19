package com.example.springBootAdvanceMapping.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "employee_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int address_id;
    private String address;
    private String city;

    @JsonBackReference
    @OneToOne(mappedBy = "address",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
    private Employee employee;

    public Address() {
    }

    public Address(String address, String city) {
        this.address = address;
        this.city = city;

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

//    @Override
//    public String toString() {
//        return "Address{" +
//                "address_id=" + address_id +
//                ", address='" + address + '\'' +
//                ", city='" + city + '\'' +
//                ", employee=" + employee +
//                '}';
//    }
}
