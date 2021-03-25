package com.example.hrsample.service;

import com.example.hrsample.model.Employee;
import com.example.hrsample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    @Transactional
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getById(UUID id) {
        return employeeRepository.findById(id);
    }

    public Optional<List<Employee>> getByPosition(String position) {
        return employeeRepository.findByPosition(position);
    }
}
