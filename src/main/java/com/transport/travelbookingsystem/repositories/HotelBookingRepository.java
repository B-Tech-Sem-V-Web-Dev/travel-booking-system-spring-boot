package com.transport.travelbookingsystem.repositories; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transport.travelbookingsystem.models.HotelBookings;

@Repository
public interface HotelBookingRepository extends JpaRepository<HotelBookings, Long> {
    List<HotelBookings> findByUsername(String username);
    List<HotelBookings> findByHotelId(Long hotelId);
    List<HotelBookings> findByTravelPlanId(Long travelPlanId);
}
