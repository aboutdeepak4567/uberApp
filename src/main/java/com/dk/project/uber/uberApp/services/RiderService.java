package com.dk.project.uber.uberApp.services;

import com.dk.project.uber.uberApp.dto.DriverDto;
import com.dk.project.uber.uberApp.dto.RideDto;
import com.dk.project.uber.uberApp.dto.RideRequestDto;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto acceptRide(Long rideId);

    DriverDto rateDriver(Long rideId,Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
