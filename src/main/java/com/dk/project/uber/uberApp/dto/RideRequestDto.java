package com.dk.project.uber.uberApp.dto;

import com.dk.project.uber.uberApp.entities.Rider;
import com.dk.project.uber.uberApp.entities.enums.PaymentMethod;
import com.dk.project.uber.uberApp.entities.enums.RideRequestStatus;
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
public class RideRequestDto {

    private Long id;

    private Point pickupLocation;
    private Point dropOffLocation;
    private PaymentMethod paymentMethod;



    private LocalDateTime requestedTime;

    private Rider rider;


    private RideRequestStatus rideRequestStatus;

}
