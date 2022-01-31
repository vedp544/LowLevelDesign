package com.test.project.service;

public class ParkingLot {

    private static ParkingLot instance;

    private ParkingLot() {

    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) {
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }
}
