package com.example.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleDataRepo extends JpaRepository<VehicleData, Long> {
    List<VehicleData> findByVehiclemodelAndVehiclemake(String vehiclemodel, String vehiclemake);
}
