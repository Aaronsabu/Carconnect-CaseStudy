package com.hexaware.carconnect;
import java.util.List;

public class ReportGenerator {
    public void generateReservationReport(List<Reservation> reservations) {
        // Generate a report based on reservation data
        System.out.println("Reservation Report:");
        for (Reservation reservation : reservations) {
            reservation.getReseration();
            System.out.println("---------------------");
        }
        System.out.println("End of Reservation Report\n");
    }

    public void generateVehicleReport(List<Vehicle> vehicles) {
       
        System.out.println("Vehicle Report:");
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicle();
            System.out.println("---------------------");
        }
        System.out.println("End of Vehicle Report\n");
    }
}
