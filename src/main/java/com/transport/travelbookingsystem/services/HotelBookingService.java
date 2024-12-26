package com.transport.travelbookingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.models.HotelBookings;
import com.transport.travelbookingsystem.repositories.HotelBookingRepository;

import java.util.List;

@Service
public class HotelBookingService {

    @Autowired
    private HotelBookingRepository hotelBookingRepository;

    public List<HotelBookings> findByTravelPlanId(Long travelPlanId) {
        return hotelBookingRepository.findByTravelPlanId(travelPlanId);
    }

    public HotelBookings saveHotelBooking(HotelBookings hotelBooking) {
        return hotelBookingRepository.save(hotelBooking);
    }

    public void deleteHotelBooking(Long id) {
        hotelBookingRepository.deleteById(id);
    }
}
