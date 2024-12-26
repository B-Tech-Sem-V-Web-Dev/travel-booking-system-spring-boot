package com.transport.travelbookingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.models.CoPassengers;
import com.transport.travelbookingsystem.repositories.CoPassengerRepository;

import java.util.List;

@Service
public class CoPassengerService {

    @Autowired
    private CoPassengerRepository coPassengerRepository;

    public List<CoPassengers> findByTravelPlanId(Long travelPlanId) {
        return coPassengerRepository.findByTravelPlanId(travelPlanId);
    }

    public CoPassengers saveCoPassenger(String loggedUser, Long travelPlanId, String coPassengerName, Boolean isRegistered) {
        CoPassengers coPassenger = new CoPassengers();
        coPassenger.setTravelPlanId(travelPlanId);
        coPassenger.setName(coPassengerName);
        coPassenger.setIsRegisteredUser(isRegistered);
        return coPassengerRepository.save(coPassenger);
    }

    public void deleteCoPassenger(Long id) {
        coPassengerRepository.deleteById(id);
    }
}
