package com.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbookingsystem.entity.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long>{

}