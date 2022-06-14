package com.keltontech.flightbokingsystem.controller;

import com.keltontech.flightbokingsystem.entities.BookingSystem;
import com.keltontech.flightbokingsystem.entities.Flight;
import com.keltontech.flightbokingsystem.entities.Passenger;
import com.keltontech.flightbokingsystem.services.PassengerServiceIMPL;
import com.keltontech.flightbokingsystem.services.iPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassengerController {

	@Autowired
	private iPassengerService passengerService;

	/**
	 * Post call for save data
	 */
	/*@GetMapping("/")
     public String showHomePage() {
    	 return "welcome";
     }
     
	@GetMapping("/welcome")
    public String showWelcomePage() {
   	 return "welcome";
    }*/
	
//	@PostMapping("/signup")
//		public String registerPassenger(@ModelAttribute Passenger passenger){
//		System.out.println(passenger);
//		return "redirect:/";
//	}
	
	/*@PostMapping("/user/new")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		usrService.saveUser(user);
		return "register_success";
	}*/
	
	@PostMapping("/signup")// produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String savePassengerDetails(Passenger passenger) {
		passengerService.acceptPassenger(passenger);
		System.out.println(passenger);
		return "success";
	}
//
//	/**
//	 * Get Allpassenger details - GET
//	 */
//
//	@GetMapping(value = "/passenger.html")
//	public ResponseEntity getAllPassengerDetails() {
//		List<Passenger> passengerList = passengerService.getAllPassenger();
//		return new ResponseEntity(passengerList, HttpStatus.OK);
//	}
//
//	@GetMapping(value = "/passenger/{id}")
//	public ResponseEntity getPassengerById(@PathVariable int id) {
//		Passenger passenger = passengerService.getPassengerById(id);
//		return new ResponseEntity(passenger, HttpStatus.OK);
//	}
//
//	/**
//	 * update passenger -PUT
//	 */
//	@PutMapping(value = "/passenger/{id}")
//	public ResponseEntity updatePassengerDetails(@PathVariable int id, @RequestBody Passenger passenger) {
//		Passenger updatePassenger = passengerService.updatePassengerDetails(id, passenger);
//		return new ResponseEntity(updatePassenger, HttpStatus.ACCEPTED);
//	}
//
//	/**
//	 * delete passenger - DELETE
//	 */
//
//	@DeleteMapping("/passenger/{id}")
//	public ResponseEntity deletePassengerDetails(@PathVariable int id) {
//		Passenger deletepassenger = passengerService.deletePassangerDetails(id);
//		return new ResponseEntity(deletepassenger, HttpStatus.OK);
//	}
//	
//	
//	/*@GetMapping(value="/booking/{id}")
//	public ResponseEntity getBookingById( @PathVariable int id) {
//		List<BookingSystem> bookingList = passengerService.searchbookingById(id);
//		return new ResponseEntity(bookingList, HttpStatus.OK);
//	}
//	
//	@GetMapping(value = "/flight/{id}")
//	public ResponseEntity getFlightById(@PathVariable int  id) {
//		List<Flight> flightList = passengerService.searchflightById(id);
//		return new ResponseEntity(flightList,HttpStatus.OK);
//	}*/
}
