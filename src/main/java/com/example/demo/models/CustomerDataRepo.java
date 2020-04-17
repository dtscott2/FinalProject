package com.example.demo.models;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDataRepo extends CrudRepository<CustomerData,Integer> {
}
