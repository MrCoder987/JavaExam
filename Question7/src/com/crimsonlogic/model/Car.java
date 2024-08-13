package com.crimsonlogic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Car {
    private int carId;
    private String licenseNumber;
    private int year;
    private String maker;
    private String model;

    public Car() {
    }

    public Car(int carId, String licenseNumber, int year, String maker, String model) {
        this.carId = carId;
        this.licenseNumber = licenseNumber;
        this.year = year;
        this.maker = maker;
        this.model = model;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
