package com.hexaware.carconnect;

import java.util.ArrayList;
import java.util.List;

public class VehicleServiceImpl implements VehicleService {
    private List<Vehicle> vehicles;

    public VehicleServiceImpl() {
        // Initialize vehicles list
        vehicles = new ArrayList<>();
    }

    @Override
    public Vehicle getVehicleById(int vehicleId) throws VehicleNotFoundException  {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleID() == vehicleId) {
                return vehicle;
            }
        }
        throw new VehicleNotFoundException("Vehicle with ID " + vehicleId + " not found."); 
    }

    @Override
    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailability()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void updateVehicle(Vehicle updatedVehicle) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleID() == updatedVehicle.getVehicleID()) {
                // Update the existing vehicle with new information
                vehicle.setModel(updatedVehicle.getModel());
                vehicle.setMake(updatedVehicle.getMake());
                vehicle.setYear(updatedVehicle.getYear());
                vehicle.setColor(updatedVehicle.getColor());
                vehicle.setRegistrationNumber(updatedVehicle.getRegistrationNumber());
                vehicle.setAvailability(updatedVehicle.isAvailability());
                vehicle.setDailyRate(updatedVehicle.getDailyRate());
                // Update other vehicle details accordingly
                return;
            }
        }
        // Handle case if the vehicle to be updated is not found
        System.out.println("Vehicle not found for update.");
    }

    @Override
    public void removeVehicle(int vehicleId) {
        vehicles.removeIf(vehicle -> vehicle.getVehicleID() == vehicleId);
    }
}
