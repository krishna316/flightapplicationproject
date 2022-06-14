package com.keltontech.flightbokingsystem.services;
import com.keltontech.flightbokingsystem.dao.BookingSystemDAO;
import com.keltontech.flightbokingsystem.entities.BookingSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookingSystemServiceIMPL implements  iBookingSystemService{

    @Autowired
    private BookingSystemDAO bookingsystemDAo;

    @Override
    public BookingSystem acceptBookingSystem(BookingSystem passenger) {
        return bookingsystemDAo.save(passenger);
    }

    @Override
    public BookingSystem updateBookingSystemDetails(int id, BookingSystem bookingsystem) {
    	BookingSystem updateBookingSystemDetails = getBookingSystemById(id);
        updateBookingSystemDetails.setStartinglocation(bookingsystem.getStartinglocation());
        updateBookingSystemDetails.setDestination(bookingsystem.getDestination());
        updateBookingSystemDetails.setDatetime(bookingsystem.getDatetime());
        updateBookingSystemDetails.setPrice(bookingsystem.getPrice());
        

        return bookingsystemDAo.save(updateBookingSystemDetails);
    }

    @Override
    public List<BookingSystem> getAllBookingSystem() {
        List<BookingSystem>bookingsystemList ;
        bookingsystemList =bookingsystemDAo.findAll();
        return bookingsystemList;
    }

    @Override
    public BookingSystem getBookingSystemById(int id) {
        return bookingsystemDAo.findById(id).get();
    }

    @Override
    public BookingSystem deleteBookingSystemDetails(int id) {
    	BookingSystem deleteBookingSystem=getBookingSystemById(id);
      bookingsystemDAo.delete(deleteBookingSystem);
        return deleteBookingSystem ;

    }
}
