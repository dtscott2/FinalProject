package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "employeedata")
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID employeeId;
    @Column(name = "employeefirstname")
    public String employeeFirstName;
    @Column(name = "employeelastname")
    public String employeeLastName;
    @Column(name = "hiredate")
    public Date hireDate;
    @Column(name = "employeeactive")
    public boolean employeeActive;
    @Column(name = "lastdate")
    public Date lastDate;




    public EmployeeData() {

    }


    public EmployeeData(UUID employeeId, String employeeFirstName, String employeeLastName, Date hireDate, Boolean employeeActive, Date lastDate) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.hireDate= hireDate;
        this.employeeActive = employeeActive;
        this.lastDate = lastDate;


    }
}

