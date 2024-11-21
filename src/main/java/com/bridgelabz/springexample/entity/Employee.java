package com.bridgelabz.springexample.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User_Data")
public class Employee {
    @Id
    @GeneratedValue
    private long emp_id;

    @Column(name = "First_Name")
    private String fName;

    private String lName;
    private String address;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String fName, String lName, String address, int age) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.age = age;
    }

    public Employee() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
