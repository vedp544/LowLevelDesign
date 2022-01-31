package com.test.project.model;

import com.test.project.constants.SpotStatus;
import com.test.project.constants.VehicleType;

public class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot(int spotId, SpotStatus status) {
        super(spotId, VehicleType.BIKE, status);
    }
}
