package com.dk.project.uber.uberApp.repositories;

import com.dk.project.uber.uberApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}
