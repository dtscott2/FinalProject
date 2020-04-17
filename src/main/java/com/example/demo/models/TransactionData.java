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


    public TransactionData(UUID transId, Date transDate, float transAmount, String transEmployee, String transVehicle) {
        this.transId = transId;
        this.transDate = transDate;
        this.transAmount = transAmount;
        this.transEmployee = transEmployee;
        this.transVehicle = transVehicle;


    }
}
