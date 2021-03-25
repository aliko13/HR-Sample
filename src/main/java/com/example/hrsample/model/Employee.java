package com.example.hrsample.model;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Entity
public class Employee {
    @Id
    private UUID id = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private String dob;
    private String salary;
    private String position;
    private Float yearsInCompany;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @Column()
    private List<EmployeeAddress> employeeAddress;

    public UUID getID() { return id; }

    public void setID(UUID eID) { this.id = eID; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Optional<List<EmployeeAddress>> getEmployeeAddress() {
        return Optional.ofNullable(employeeAddress);
    }

    public void setEmployeeAddress(List<EmployeeAddress> employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Float getYearsInCompany() {
        return yearsInCompany;
    }

    public void setYearsInCompany(Float yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
    }
}
