package com.dk.project.uber.uberApp.services.impl;

import com.dk.project.uber.uberApp.dto.DriverDto;
import com.dk.project.uber.uberApp.dto.RideDto;
import com.dk.project.uber.uberApp.dto.RideRequestDto;
import com.dk.project.uber.uberApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
