package com.hexaware.carconnect;
import java.util.List;

public interface VehicleService {
    Vehicle getVehicleById(int vehicleId) throws VehicleNotFoundException;
    List<Vehicle> getAvailableVehicles();
    void addVehicle(Vehicle vehicle);
    void updateVehicle(Vehicle updatedVehicle);
    void removeVehicle(int vehicleId);
}
