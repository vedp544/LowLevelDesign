package com.test.project.repository;

import com.test.project.constants.SpotStatus;
import com.test.project.model.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ParkingLotDao {

    public List<ParkingFloor> parkingFloorList = new LinkedList<>();

    public ParkingLotDao() {
        ParkingFloor lowerGroundFloor = new LowerGroundParkingFloor();
        BikeParkingSpot bp1 = new BikeParkingSpot(1, SpotStatus.AVAILABLE);
        bp1.setParkingFloor(lowerGroundFloor);
        CarParkingSpot cp1 = new CarParkingSpot(4, SpotStatus.AVAILABLE);
        cp1.setParkingFloor(lowerGroundFloor);
        lowerGroundFloor.addSpot(bp1);
        lowerGroundFloor.addSpot(cp1);

        ParkingFloor upperGroundFloor = new UpperGroundParkingFloor();
        BikeParkingSpot bp2 = new BikeParkingSpot(2, SpotStatus.AVAILABLE);
        bp2.setParkingFloor(upperGroundFloor);
        CarParkingSpot cp2 = new CarParkingSpot(5, SpotStatus.AVAILABLE);
        cp2.setParkingFloor(upperGroundFloor);
        upperGroundFloor.addSpot(bp2);
        upperGroundFloor.addSpot(cp2);


        ParkingFloor groundFloor = new GroundParkingFloor();
        BikeParkingSpot bp3 = new BikeParkingSpot(3, SpotStatus.AVAILABLE);
        bp3.setParkingFloor(groundFloor);
        CarParkingSpot cp3 = new CarParkingSpot(6, SpotStatus.AVAILABLE);
        cp3.setParkingFloor(groundFloor);
        groundFloor.addSpot(bp3);
        groundFloor.addSpot(cp3);

        parkingFloorList.add(lowerGroundFloor);
        parkingFloorList.add(upperGroundFloor);
        parkingFloorList.add(groundFloor);
    }

    public List<ParkingFloor> getParkingFloor() {
        return this.parkingFloorList;
    }
}
