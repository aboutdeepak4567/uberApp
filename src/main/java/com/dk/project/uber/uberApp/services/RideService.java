package com.dk.project.uber.uberApp.services;

import com.dk.project.uber.uberApp.dto.RideDto;
import com.dk.project.uber.uberApp.dto.RideRequestDto;
import com.dk.project.uber.uberApp.entities.Driver;
import com.dk.project.uber.uberApp.entities.Ride;
import com.dk.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateStatus(Long RideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long rideId, PageRequest pageRequest);

    Page<Ride>  getAllRidesOfDriver(Long driverId,PageRequest pageRequest);



}
