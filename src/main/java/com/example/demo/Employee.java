package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@lombok.Data
@Entity
public class Employee {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    @Column(name = "salary")
    private int salary;

}