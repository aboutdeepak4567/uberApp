package com.dk.project.uber.uberApp.dto;

import com.dk.project.uber.uberApp.entities.Driver;
import com.dk.project.uber.uberApp.entities.Rider;
import com.dk.project.uber.uberApp.entities.enums.PaymentMethod;
import com.dk.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDto {


    private Long id;


    private Point pickupLocation;


    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private Rider rider;

    private Driver driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}
