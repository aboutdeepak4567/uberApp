package com.dk.project.uber.uberApp.services;

import com.dk.project.uber.uberApp.dto.DriverDto;
import com.dk.project.uber.uberApp.dto.RideDto;

import java.util.List;

public interface DriverService {

    RideDto cancelRide(Long rideId);

    RideDto acceptRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long rideId,Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();





}
