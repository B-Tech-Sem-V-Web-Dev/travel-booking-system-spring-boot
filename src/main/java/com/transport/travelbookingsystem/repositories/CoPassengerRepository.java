package com.transport.travelbookingsystem.repositories; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transport.travelbookingsystem.models.CoPassengers;

@Repository
public interface CoPassengerRepository extends JpaRepository<CoPassengers, Long> {
    List<CoPassengers> findByTravelPlanId(Long travelPlanId);
}
