package com.test.project.model;

import com.test.project.constants.VehicleType;

public class Bike extends Vehicle {

    public Bike(int licenseNum, String color) {
        super(licenseNum, color, VehicleType.BIKE);
    }
}
