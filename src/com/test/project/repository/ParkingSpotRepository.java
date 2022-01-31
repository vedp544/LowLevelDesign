package com.test.project.repository;

import com.test.project.constants.ParkingLevel;
import com.test.project.constants.SpotStatus;
import com.test.project.model.*;

import java.util.Arrays;
import java.util.List;

public class ParkingSpotRepository {
    private List<BikeParkingSpot> bikeParkingSpotList;
    private List<CarParkingSpot> carParkingSpotList;

    public ParkingSpotRepository() {
        BikeParkingSpot bp1 = new BikeParkingSpot(1, SpotStatus.AVAILABLE);
        BikeParkingSpot bp2 = new BikeParkingSpot(2, SpotStatus.AVAILABLE);
        BikeParkingSpot bp3 = new BikeParkingSpot(3, SpotStatus.AVAILABLE);
        bikeParkingSpotList.add(bp1);
        bikeParkingSpotList.add(bp1);
        bikeParkingSpotList.add(bp1);

        CarParkingSpot cp1 = new CarParkingSpot(4, SpotStatus.AVAILABLE);
        CarParkingSpot cp2 = new CarParkingSpot(5, SpotStatus.AVAILABLE);
        CarParkingSpot cp3 = new CarParkingSpot(6, SpotStatus.AVAILABLE);
        carParkingSpotList.add(cp1);
        carParkingSpotList.add(cp2);
        carParkingSpotList.add(cp3);
    }

    public List<BikeParkingSpot> getBikeParkingSpotList() {
        return bikeParkingSpotList;
    }

    public List<CarParkingSpot> getCarParkingSpotList() {
        return carParkingSpotList;
    }
}
