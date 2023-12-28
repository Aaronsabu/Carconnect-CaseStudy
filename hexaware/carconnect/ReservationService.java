package com.hexaware.carconnect;
import java.util.List;

public interface ReservationService {
    Reservation getReservationById(int reservationId);
    List<Reservation> getReservationsByCustomerId(int customerId);
    void createReservation(Reservation reservation) throws ReservationException;
    void updateReservation(Reservation updatedReservation);
    void cancelReservation(int reservationId);
}
