package com.test.project.model;

import com.test.project.constants.VehicleType;

public abstract class Vehicle {
    int licenseNum;
    String color;
    VehicleType vehicleType;

    public Vehicle(int licenseNum, String color, VehicleType vehicleType) {
        this.licenseNum = licenseNum;
        this.color = color;
        this.vehicleType = vehicleType;
    }

    public int getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(int licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
