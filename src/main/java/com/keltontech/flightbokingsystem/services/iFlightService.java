package com.keltontech.flightbokingsystem.services;
import com.keltontech.flightbokingsystem.entities.Flight;

import java.util.List;

public interface iFlightService {

    public Flight acceptFlight(Flight flight);
    public Flight updateFlightDetails(int id,Flight flight);
    public List<Flight> getAllFlight();
    public Flight getFlightById(int id);
    public Flight deleteFlightDetails(int id);


}