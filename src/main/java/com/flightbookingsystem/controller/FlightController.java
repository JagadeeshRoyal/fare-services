package com.flightbookingsystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbookingsystem.entity.Flight;
import com.flightbookingsystem.repository.FlightRepo;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepo flightRepo;
    @Autowired
    private static final Logger LOGGER = LoggerFactory.getLogger(FlightController.class);

    @GetMapping
    public List<Flight> getAllFlights() {
    	LOGGER.info("getAllFlights");
        return flightRepo.findAll();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
    	LOGGER.info("getFlightById: {}",id);
        return flightRepo.findById(id).orElse(null);
    }
    @PostMapping
    public Flight saveFlight(@RequestBody Flight flight) {
		return flightRepo.save(flight);
    	
    }
}