package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "transactiondata")
public class TransactionData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID transId;
    @Column(name = "transdate")
    public Date transDate;
    @Column(name = "transamount")
    public float transAmount;
    @Column(name = "transemployee")
    public String transEmployee;
    @Column(name = "transvehicle")
    public String transVehicle;


    public TransactionData() {

    }
    public TransactionData(UUID transId, Date transDate, float transAmount, String transEmployee, String transVehicle)
    {
        this.transId = transId;
        this.transDate = transDate;
        this.transAmount = transAmount;
        this.transEmployee = transEmployee;
        this.transVehicle = transVehicle;
    }
    public UUID getTransId(){
        return transId;
    }
    public void setTransId(UUID transId){
        this.transId = transId;
    }

    public Date getTransDate() {
        return transDate;
    }
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public float getTransAmount() {
        return transAmount;
    }
    public void setTransAmount(float transAmount) {
        this.transAmount = transAmount;
    }

    public String getTransEmployee() {
        return transEmployee;
    }
    public void setTransEmployee(String transEmployee) {
        this.transEmployee = transEmployee;
    }

    public String getTransVehicle() {
        return transVehicle;
    }
    public void setTransVehicle(String transVehicle) {
        this.transVehicle = transVehicle ;
    }

}
