package com.example.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "employeedata")
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID employeeId;
    @Column(name = "employeefirstname")
    @NotBlank(message = "Please enter first name")
    public String employeeFirstName;
    @Column(name = "employeelastname")
    @NotBlank(message = "Please enter last name")
    public String employeeLastName;
    @Column(name = "hiredate")
    @NotBlank(message = "Please enter hire date")
    public Date hireDate;
    @Column(name = "employeeactive")
    public boolean employeeActive;
    @Column(name = "lastdate")
    public Date lastDate;


    public EmployeeData() {

    }


    public EmployeeData(UUID employeeId, String employeeFirstName, String employeeLastName, Date hireDate, boolean employeeActive, Date lastDate) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.hireDate = hireDate;
        this.employeeActive = employeeActive;
        this.lastDate = lastDate;

    }

    public UUID getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(UUID employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName(){
        return employeeLastName;
    }
    public void setEmployeeLastName(){
        this.employeeLastName = employeeLastName;
    }

    public Date getHireDate(){
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public boolean getEmployeeActive(){
        return employeeActive;
    }
    public void setEmployeeActive(boolean employeeActive){
        this.employeeActive = employeeActive;
    }

    public Date getLastDate() {
        return lastDate;
    }
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

}
