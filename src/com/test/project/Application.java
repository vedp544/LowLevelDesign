package com.test.project;

import com.test.project.constants.SpotStatus;
import com.test.project.model.*;
import com.test.project.repository.ParkingLotDao;

import java.util.Date;
import java.util.List;

public class Application {
    private static ParkingLotDao pDao;
    public static int ticketNumber=1;

    // issue ticket
    public ParkingTicket issueTicket(Vehicle vehicle) {
        ParkingTicket parkingTicket = null;
        List<ParkingFloor> parkingFloorList = pDao.getParkingFloor();
        for (int i=0; i<parkingFloorList.size(); i++) {
            boolean spotFound = false;
            List<ParkingSpot> parkingSpots = parkingFloorList.get(i).getSpots();
            for (int j=0; j<parkingSpots.size(); j++) {
                ParkingSpot parkingSpot = parkingSpots.get(j);
                if (!parkingSpot.isFull() && parkingSpot.getSpotType().equals(vehicle.getVehicleType())) {
                    parkingTicket = new ParkingTicket();
                    parkingSpot.setStatus(SpotStatus.OCCUPIED);
                    parkingTicket.setVehicle(vehicle);
                    parkingTicket.setParkingSpot(parkingSpot);
                    parkingTicket.setTicketNumber(ticketNumber++);
                    parkingTicket.setStartTime(new Date());
                    spotFound = true;
                    break;
                }
            }
            if (spotFound) {
                break;
            }
        }
        return parkingTicket;
    }

    public static void main(String[] args) {
        Application app = new Application();
        pDao= new ParkingLotDao();
        Vehicle vehicle = new Car(1, "Green");
        ParkingTicket parkingTicket = app.issueTicket(vehicle);
        pDao.getParkingFloor();
        System.out.println("Done");
    }
}
