package com.test.project.model;

import com.test.project.constants.VehicleType;

public class Car extends Vehicle{
    public Car(int licenseNum, String color) {
        super(licenseNum, color, VehicleType.CAR);
    }
}
