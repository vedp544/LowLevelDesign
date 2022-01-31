package com.test.project.repository;

import com.test.project.constants.ParkingLevel;
import com.test.project.model.*;

import java.util.List;

public class ParkingFloorRepository {

    public List<ParkingFloor> parkingFloorList;

    public ParkingFloorRepository() {
        ParkingFloor lgf = new LowerGroundParkingFloor();
        ParkingFloor ugf = new UpperGroundParkingFloor();
        ParkingFloor gf = new GroundParkingFloor();

        ParkingSpotRepository psr = new ParkingSpotRepository();
        List<BikeParkingSpot> bikeParkingSpots = psr.getBikeParkingSpotList();
        List<BikeParkingSpot> carParkingSpots = psr.getBikeParkingSpotList();

        parkingFloorList.add(lgf);
        parkingFloorList.add(ugf);
        parkingFloorList.add(gf);
    }

    public List<ParkingFloor> getParkingFloors() {
        return this.parkingFloorList;
    }

}
