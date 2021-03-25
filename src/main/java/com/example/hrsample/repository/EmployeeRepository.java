package com.example.hrsample.repository;

import com.example.hrsample.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends CrudRepository<Employee, UUID> {
    Optional<Employee> findById(UUID id);
    Optional<List<Employee>> findByPosition(String position);
}
