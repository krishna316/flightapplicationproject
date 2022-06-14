package com.keltontech.flightbokingsystem.controller;
import com.keltontech.flightbokingsystem.entities.Flight;
import com.keltontech.flightbokingsystem.services.iFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private iFlightService flightService;

    /**
     * Post call for save data
     */

    @PostMapping(value = "/flight", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveFlightDetails(@RequestBody Flight flight){
    	Flight saveFlightDetails = flightService.acceptFlight(flight);
        return new ResponseEntity(saveFlightDetails, HttpStatus.CREATED);
    }

    /**
     * Get Allflight details - GET
     */

    @GetMapping("/flight")
    private List<Flight> getAllFlight(){
    	return flightService.getAllFlight();
    }
    
    public ResponseEntity getAllFlightDetails(){
        List<Flight> flightList = flightService.getAllFlight();
        return  new ResponseEntity(flightList,HttpStatus.OK);

    }

    @GetMapping(value = "/flight/{id}")
    public  ResponseEntity getFlightById(@PathVariable int id){
    	Flight flight = flightService.getFlightById(id);
        return  new ResponseEntity(flight,HttpStatus.OK);
    }

    /**
     * update flight -PUT
     */
    @PutMapping(value = "/flight/{id}")
    public  ResponseEntity updateFlightDetails(@PathVariable int id, @RequestBody Flight flight){
    	Flight updateflight = flightService.updateFlightDetails(id,flight);
        return  new ResponseEntity(updateflight,HttpStatus.ACCEPTED);
    }

    /**
     * delete flight - DELETE
     */

    @DeleteMapping("/flight/{id}")
    public  ResponseEntity deleteFlightDetails(@PathVariable int id){
    	Flight deleteflight = flightService.deleteFlightDetails(id);
        return  new ResponseEntity(deleteflight,HttpStatus.OK);
    }
}
