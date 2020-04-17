package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "customerdata")

public class CustomerData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID customerId;
    @Column(name = "customerfirstname")
    public String customerFirstName;
    @Column(name = "customerlastname")
    public String customerLastName;
    @Column(name = "vehiclepurchased")
    public String vehiclePurchased;
    @Column(name = "datepurchased")
    public Date datePurchased;
    @Column (name = "salesperson")
    public String salesPerson;
    public CustomerData(){

    }
    public CustomerData(UUID customerId, String customerFirstName, String customerLastName, String vehiclePurchased,
                        Date datePurchased, String salesPerson) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.vehiclePurchased = vehiclePurchased;
        this.datePurchased = datePurchased;
        this.salesPerson = salesPerson;
    }
    public UUID getCustomerId(){
        return customerId;
    }
    public void setCustomerId(UUID customerId){
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName(){
        return customerLastName;
    }
    public void setCustomerLastName(String customerLastName){
        this.customerLastName = customerLastName;
    }

    public String  getVehiclePurchased(){
        return vehiclePurchased;
    }
    public void setVehiclePurchased(String vehiclePurchased) {
        this.vehiclePurchased = vehiclePurchased;
    }

    public Date getDatePurchased(){
        return datePurchased;
    }
    public void setDatePurchased(Date datePurchased){
        this.datePurchased = datePurchased;
    }

    public String getSalesPerson() {
        return salesPerson;
    }
    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

}
