package com.example.hrsample.controller;

import com.example.hrsample.model.Employee;
import com.example.hrsample.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    public EmployeeService employeeService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    private void createEmployee(@RequestBody() Employee employee) {
        logger.info("Creating employee data based on request: "+employee);
        employeeService.save(employee);
    }
}