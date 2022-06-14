package com.keltontech.flightbokingsystem.services;
import com.keltontech.flightbokingsystem.dao.BookingSystemDAO;
import com.keltontech.flightbokingsystem.dao.FlightDAO;
import com.keltontech.flightbokingsystem.entities.BookingSystem;
import com.keltontech.flightbokingsystem.entities.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FlightServiceIMPL implements  iFlightService{

    @Autowired
    private FlightDAO flightDAo;

    @Override
    public Flight acceptFlight(Flight flight) {
        return flightDAo.save(flight);
    }

    @Override
    public Flight updateFlightDetails(int id, Flight flight) {
    	Flight updateFlightDetails = getFlightById(id);
        updateFlightDetails.setFlightname(flight.getFlightname());
        updateFlightDetails.setFlightstatus(flight.getFlightstatus());
        updateFlightDetails.setFlightcapacity(flight.getFlightcapacity());
        

        return flightDAo.save(updateFlightDetails);
    }

    @Override
    public List<Flight> getAllFlight() {
        List<Flight>flightList ;
        flightList = flightDAo.findAll();
        return flightList;
    }

    @Override
    public Flight getFlightById(int id) {
        return flightDAo.findById(id).get();
    }

    @Override
    public Flight deleteFlightDetails(int id) {
    	Flight deleteFlight=getFlightById(id);
    	flightDAo.delete(deleteFlight);
        return deleteFlight ;

    }
}
