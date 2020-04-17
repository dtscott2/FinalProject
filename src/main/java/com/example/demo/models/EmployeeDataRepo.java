package com.example.demo.models;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeDataRepo extends CrudRepository<EmployeeData,Integer> {
}
