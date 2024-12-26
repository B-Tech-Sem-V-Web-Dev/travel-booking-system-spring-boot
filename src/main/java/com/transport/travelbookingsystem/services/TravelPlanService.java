package com.transport.travelbookingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.models.TravelPlans;
import com.transport.travelbookingsystem.models.Users;
import com.transport.travelbookingsystem.repositories.TravelPlanRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TravelPlanService {

    @Autowired
    private TravelPlanRepository travelPlanRepository;

    public Optional<TravelPlans> findById(Long id) {
        return travelPlanRepository.findById(id);
    }

    public List<TravelPlans> findByUser(Users user) {
        return travelPlanRepository.findByUser(user);
    }

    public TravelPlans saveTravelPlan(TravelPlans travelPlan) {
        return travelPlanRepository.save(travelPlan);
    }

    public void deleteTravelPlan(Long id) {
        travelPlanRepository.deleteById(id);
    }
}
