package com.test.project.model;

import com.test.project.constants.SpotStatus;
import com.test.project.constants.VehicleType;

public abstract class ParkingSpot {
    private int spotId;
    private final VehicleType spotType;
    private SpotStatus status;
    private ParkingFloor parkingFloor;

    public ParkingSpot(int spotId, VehicleType spotType, SpotStatus status) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.status = status;
    }

    public ParkingSpot(int spotId, VehicleType spotType, SpotStatus status, ParkingFloor parkingFloor) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.status = status;
        this.parkingFloor = parkingFloor;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public boolean isFull() {
        return this.status.equals(SpotStatus.OCCUPIED) ? true : false;
    }

    public int getSpotId() {
        return spotId;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }
}
