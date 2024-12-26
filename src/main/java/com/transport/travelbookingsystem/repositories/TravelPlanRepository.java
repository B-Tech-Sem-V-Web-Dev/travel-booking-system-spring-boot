package com.transport.travelbookingsystem.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transport.travelbookingsystem.models.TravelPlans;
import com.transport.travelbookingsystem.models.Users;

import java.util.List;

@Repository
public interface TravelPlanRepository extends JpaRepository<TravelPlans, Long> {
    List<TravelPlans> findByUser(Users user);
}
