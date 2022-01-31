package com.test.project.model;

import com.test.project.constants.ParkingLevel;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingFloor {
    private final ParkingLevel level;
    private List<ParkingSpot> spots;

    public ParkingFloor(ParkingLevel level) {
        this.spots = new ArrayList<>();
        this.level = level;
    }

    public ParkingFloor(ParkingLevel level, List<ParkingSpot> spots) {
        this.level = level;
        this.spots = new ArrayList<>(spots);
    }

    //    private ParkingFloor(ParkingFloorBuilder builder) {
//        this.floorId = builder.floorId;
//        this.level = builder.level;
//        this.spots = builder.spots;
//    }

    public ParkingLevel getLevel() {
        return level;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void addSpot(ParkingSpot parkingSpot) {
        this.spots.add(parkingSpot);
    }

    public boolean isFull() {
        for (int i = 0; i < this.spots.size(); i++) {
            ParkingSpot spot = this.spots.get(i);
            if (!spot.isFull()) {
                return false;
            }
        }
        return true;
    }
}


//public static class ParkingFloorBuilder {
//    private int floorId;
//    private ParkingLevel level;
//    private List<ParkingSpot> spots;
//
//    public ParkingFloorBuilder floorId(int floorId) {
//        this.floorId = floorId;
//        return this;
//    }
//
//    public ParkingFloorBuilder level(ParkingLevel level) {
//        this.level = level;
//        return this;
//    }
//
//    public ParkingFloorBuilder spots(List<ParkingSpot> spots) {
//        this.spots = new ArrayList<>(spots);
//        return this;
//    }
//
//
//    //Return the finally constructed ParkingFloor object
//    public ParkingFloor build() {
//        ParkingFloor parkingFloor = new ParkingFloor(this);
//        return parkingFloor;
//    }
//}


