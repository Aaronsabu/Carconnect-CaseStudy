package com.hexaware.carconnect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {
    private List<Reservation> reservations = new ArrayList<>();

    public ReservationServiceImpl() {
        reservations = new ArrayList<>();
    }

    @Override
    public Reservation getReservationById(int reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationID() == reservationId) {
                return reservation;
            }
        }
        return null; // Return null if reservation is not found
    }

    @Override
    public List<Reservation> getReservationsByCustomerId(int customerId) {
        List<Reservation> customerReservations = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getCustomerID() == customerId) {
                customerReservations.add(reservation);
            }
        }
        return customerReservations;
    }

    @Override
    public void createReservation(Reservation reservation) throws ReservationException {
        if (isVehicleAlreadyReserved(reservation.getVehicleID())) {
            throw new ReservationException("Vehicle is already reserved."); // Throw ReservationException
        }
        reservations.add(reservation);
    }
    
    private boolean isVehicleAlreadyReserved(int vehicleId) {
        for (Reservation reservation : reservations) {
            if (reservation.getVehicleID() == vehicleId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void updateReservation(Reservation updatedReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationID() == updatedReservation.getReservationID()) {
                // Update the existing reservation with new information
                // ...
                // For example:
                reservation.setStartDate(updatedReservation.getStartDate());
                reservation.setEndDate(updatedReservation.getEndDate());
                reservation.setTotalCost(updatedReservation.getTotalCost());
                reservation.setStatus(updatedReservation.getStatus());
                return;
            }
        }
        System.out.println("Reservation not found for update.");
    }

    @Override
    public void cancelReservation(int reservationId) {
        Iterator<Reservation> iterator = reservations.iterator();
        while (iterator.hasNext()) {
            Reservation reservation = iterator.next();
            if (reservation.getReservationID() == reservationId) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Reservation not found for cancellation.");
    }
}
