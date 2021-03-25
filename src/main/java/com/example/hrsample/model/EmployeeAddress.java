package com.example.hrsample.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class EmployeeAddress {
    @Id
    private UUID id = UUID.randomUUID();
    private String country;
    private String city;
    private String street;
    private String houseNo;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    public UUID getID() {
        return id;
    }

    public void setID(UUID aID) {
        this.id = aID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
