package com.test.project.model;

import java.util.Date;

public class ParkingTicket {
    private int ticketNumber;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private Date startTime;
    private Date endTime;

    public ParkingTicket() {
    }

    public ParkingTicket(int ticketNumber, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.ticketNumber = ticketNumber;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
