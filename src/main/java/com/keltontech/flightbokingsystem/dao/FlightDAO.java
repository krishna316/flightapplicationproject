package com.keltontech.flightbokingsystem.dao;

import com.keltontech.flightbokingsystem.entities.Flight;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface FlightDAO extends JpaRepository<Flight,Integer> {
	
}

