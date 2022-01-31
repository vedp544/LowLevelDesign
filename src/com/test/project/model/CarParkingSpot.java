package com.test.project.model;

import com.test.project.constants.SpotStatus;
import com.test.project.constants.VehicleType;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int spotId, SpotStatus status) {
        super(spotId, VehicleType.CAR, status);
    }
}
