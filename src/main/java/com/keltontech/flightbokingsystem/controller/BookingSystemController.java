package com.keltontech.flightbokingsystem.controller;
import com.keltontech.flightbokingsystem.entities.BookingSystem;
import com.keltontech.flightbokingsystem.entities.Passenger;
import com.keltontech.flightbokingsystem.services.iBookingSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingSystemController {

    @Autowired
    private iBookingSystemService bookingsystemService;

    /**
     * Post call for save data
     */
 
    @PostMapping("/booking")// produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String savePassengerDetails(@RequestBody BookingSystem bookingsystem) {
		bookingsystemService.acceptBookingSystem(bookingsystem);
		System.out.println(bookingsystem);
		return "success";
	}
    
     
    
    
//    @PostMapping(value = "/booking_system", produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity saveBookingSystemDetails(@RequestBody BookingSystem bookingsystem){
//    	BookingSystem saveBookingSystemDetails = bookingsystemService.acceptBookingSystem(bookingsystem);
//        return new ResponseEntity(saveBookingSystemDetails, HttpStatus.CREATED);
//    }

    /**
     * Get Allbookingsystem details - GET
     */

//    @GetMapping("/booking_system")
//    private List<BookingSystem> getAllBookingSystem(){
//    	return bookingsystemService.getAllBookingSystem();
//    }
    
    @GetMapping(value="/booking_system")
    public ResponseEntity getAllBookingSystemDetails(){
        List<BookingSystem> bookingsystemList = bookingsystemService.getAllBookingSystem();
        return  new ResponseEntity(bookingsystemList,HttpStatus.OK);

    }

    @GetMapping(value = "/booking_system/{id}")
    public  ResponseEntity getBookingSystemById(@PathVariable int id){
    	BookingSystem bookingsystem = bookingsystemService.getBookingSystemById(id);
        return  new ResponseEntity(bookingsystem,HttpStatus.OK);
    }

    /**
     * update bookingsystem -PUT
     */
    @PostMapping(value = "/booking_system/{id}")
    public  ResponseEntity updateBookingSystemDetails(@PathVariable int id, @RequestBody BookingSystem bookingsystem){
    	BookingSystem updateBookingSystem = bookingsystemService.updateBookingSystemDetails(id,bookingsystem);
        return  new ResponseEntity(updateBookingSystem,HttpStatus.ACCEPTED);
    }

    /**
     * delete bookingsystem - DELETE
     */

    @DeleteMapping("/booking_system/{id}")
    public  ResponseEntity deleteBookingSystemDetails(@PathVariable int id){
    	BookingSystem bookingsystem = bookingsystemService.deleteBookingSystemDetails(id);
        return  new ResponseEntity(bookingsystem,HttpStatus.OK);
    }
}