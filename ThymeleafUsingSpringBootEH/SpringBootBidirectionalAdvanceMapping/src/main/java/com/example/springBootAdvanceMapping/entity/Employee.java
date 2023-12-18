package com.example.springBootAdvanceMapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_information")
public class Employee {
    @Id
    private int employee_id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_info_address_id")
    private Address address;

    public Employee() {
    }

    public Employee(int employee_id, String name,Address address) {
        this.employee_id = employee_id;
        this.name = name;
        this.address=address;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
