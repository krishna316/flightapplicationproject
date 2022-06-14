package com.keltontech.flightbokingsystem.services;

import com.keltontech.flightbokingsystem.entities.BookingSystem;
import com.keltontech.flightbokingsystem.entities.Flight;
import com.keltontech.flightbokingsystem.entities.Passenger;

import java.util.List;

public interface iPassengerService {

    public Passenger acceptPassenger(Passenger passenger);
    public Passenger updatePassengerDetails(int id,Passenger passenger);
    public List<Passenger> getAllPassenger();
    public Passenger getPassengerById(int id);
    public Passenger deletePassangerDetails(int id);
    /*public List<Flight> searchflightById(int id);
    public List<BookingSystem> searchbookingById(int id);*/

}
