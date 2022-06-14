package com.keltontech.flightbokingsystem.services;

import com.keltontech.flightbokingsystem.dao.BookingSystemDAO;
import com.keltontech.flightbokingsystem.dao.PassengerDAo;
import com.keltontech.flightbokingsystem.entities.BookingSystem;
import com.keltontech.flightbokingsystem.entities.Flight;
import com.keltontech.flightbokingsystem.entities.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PassengerServiceIMPL implements  iPassengerService{

    @Autowired
    private PassengerDAo passengerDAo;
    
    @Autowired
    private BookingSystemDAO bookingSystemDAo;
    
    @Override
    public Passenger acceptPassenger(Passenger passenger) {
        return passengerDAo.save(passenger);
    }

    
    @Override
    public Passenger updatePassengerDetails(int id, Passenger passenger) {
        Passenger updatePassengerDetails = getPassengerById(id);
        updatePassengerDetails.setAddress(passenger.getAddress());
        updatePassengerDetails.setAge(passenger.getAge());
        updatePassengerDetails.setEmail(passenger.getEmail());
        updatePassengerDetails.setGender(passenger.getGender());
        updatePassengerDetails.setName(passenger.getName());

        return passengerDAo.save(updatePassengerDetails);
    }

    @Override
    public List<Passenger> getAllPassenger() {
        List<Passenger>passengersList ;
        passengersList =passengerDAo.findAll();
        return passengersList;
    }

    @Override
    public Passenger getPassengerById(int id) {
        return passengerDAo.findById(id).get();
    }

    @Override
    public Passenger deletePassangerDetails(int id) {
        Passenger deletePassenger=getPassengerById(id);
        passengerDAo.delete(deletePassenger);
        return deletePassenger ;

    }

	/*@Override
	public List<Flight> searchflightById(int id) {
		List<Flight> flightList = passengerDAo.findByFlightId(id) ;
		return flightList;
		
	}*/

	/*@Override
	public List<BookingSystem> searchbookingById(int id) {
		List<BookingSystem> bookingList = bookingSystemDAo.findByBookingId(id) ;
		return bookingList;
	}*/
	
	
}
