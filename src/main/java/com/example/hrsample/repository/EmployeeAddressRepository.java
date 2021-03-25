package com.example.hrsample.repository;

import com.example.hrsample.model.EmployeeAddress;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EmployeeAddressRepository extends CrudRepository<EmployeeAddress, UUID> {}
