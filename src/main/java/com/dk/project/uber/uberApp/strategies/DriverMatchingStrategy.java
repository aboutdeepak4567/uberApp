package com.dk.project.uber.uberApp.strategies;

import com.dk.project.uber.uberApp.dto.RideRequestDto;
import com.dk.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
