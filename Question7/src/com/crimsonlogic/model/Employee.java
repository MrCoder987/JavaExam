package com.crimsonlogic.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String city;
    private double salary;
    private Car allotedCar;

    public Employee() {
    }

    public Employee(int employeeId, String firstName, String lastName, String fullName, String city, double salary, Car allotedCar) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.city = city;
        this.salary = salary;
        this.allotedCar = allotedCar;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Car getAllotedCar() {
        return allotedCar;
    }

    public void setAllotedCar(Car allotedCar) {
        this.allotedCar = allotedCar;
    }

}
