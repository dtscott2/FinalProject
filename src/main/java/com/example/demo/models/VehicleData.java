package com.example.demo.models;

import javax.persistence.*;
import java.time.Year;
import java.util.Date;
import java.util.UUID;

@Entity
@Table (name = "vehicledata")
public class VehicleData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID vehicleId;
    @Column(name = "vehiclemake")
    public String vehicleMake;
    @Column(name = "vehiclemodel")
    public String vehicleModel;
    @Column(name = "vehicleyear")
    public Year vehicleYear;
    @Column(name = "vehiclevin")
    public String vehicleVIN;
    @Column(name = "vehiclecolor")
    public String  vehicleColor;
    @Column(name = "vehiclemileage")
    public int  vehicleMileage;
    @Column(name = "vehicleprice")
    public int vehiclePrice;
    @Column(name = "vehicleavail")
    public boolean vehicleAvail;
    public VehicleData(){

    }
    public VehicleData(UUID vehicleId, String vehicleMake, String vehicleModel, Year vehicleYear,
                        String  vehicleVIN, String vehicleColor, int vehicleMileage, int vehiclePrice, boolean vehicleAvail) {
        this.vehicleId = vehicleId;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehicleVIN = vehicleVIN;
        this.vehicleColor = vehicleColor;
        this.vehicleMileage = vehicleMileage;
        this.vehiclePrice = vehiclePrice;
        this.vehicleAvail = vehicleAvail;
    }

    public UUID getVehicleId(){
        return vehicleId;
    }
    public void setVehicleId(UUID vehicleId){
        this.vehicleId = vehicleId;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }
    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel(){
        return vehicleModel;
    }
    public void setVehicleModel(String vehicleModel){
        this.vehicleModel = vehicleModel;
    }

    public Year getVehicleYear(){
        return vehicleYear;
    }
    public void setVehicleYear(Year vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleVIN(){
        return vehicleVIN;
    }
    public void setVehicleVIN(String vehicleVIN){
        this.vehicleVIN = vehicleVIN;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }
    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public int getVehicleMileage() {
        return vehicleMileage;
    }
    public void setVehicleMileage(int vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }
    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
    public boolean getVehicleAvail() {
        return vehicleAvail;
    }
    public void setVehicleAvail(boolean vehicleAvail) {
        this.vehicleAvail = vehicleAvail;
    }
}

