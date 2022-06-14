package com.keltontech.flightbokingsystem.services;
import com.keltontech.flightbokingsystem.entities.BookingSystem;

import java.util.List;

public interface iBookingSystemService {

    public BookingSystem acceptBookingSystem(BookingSystem bookingsystem);
    public BookingSystem updateBookingSystemDetails(int id,BookingSystem bookingsystem);
    public List<BookingSystem> getAllBookingSystem();
    public BookingSystem getBookingSystemById(int id);
    public BookingSystem deleteBookingSystemDetails(int id);
}