package com.keltontech.flightbokingsystem.dao;

import com.keltontech.flightbokingsystem.entities.Flight;
import com.keltontech.flightbokingsystem.entities.Passenger;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PassengerDAo extends JpaRepository<Passenger,Integer> {
	//public List<Flight> findByFlightId(@Param("flightId")int Id );
	
}
