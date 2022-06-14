package com.keltontech.flightbokingsystem.dao;

import com.keltontech.flightbokingsystem.entities.BookingSystem;
import com.keltontech.flightbokingsystem.entities.Flight;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface BookingSystemDAO extends JpaRepository<BookingSystem,Integer> {
	public List<BookingSystem> findByBookingId(@Param("bookingId")int Id );
}
