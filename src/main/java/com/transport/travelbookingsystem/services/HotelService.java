package com.transport.travelbookingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.models.Hotels;
import com.transport.travelbookingsystem.repositories.HotelRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    // Find hotels by location
    public List<Hotels> findByLocation(String location) {
        return hotelRepository.findByLocation(location); // Assuming the repository has this method
    }

    // Find hotels by hotel name
    public List<Hotels> findByHotelName(String hotelName) {
        return hotelRepository.findByHotelName(hotelName); // Case insensitive search
    }

    // Save a new hotel or update an existing one
    public Hotels saveHotel(Hotels hotel) {
        return hotelRepository.save(hotel); // Save or update hotel
    }

    // Delete a hotel by ID
    public void deleteHotel(Long id) {
        Optional<Hotels> hotel = hotelRepository.findById(id);
        if (hotel.isPresent()) {
            hotelRepository.deleteById(id); // Delete the hotel if found
        } else {
            // Handle case where hotel is not found (optional)
            throw new IllegalArgumentException("Hotel with id " + id + " not found");
        }
    }

    // Get a hotel by ID (for details or booking purposes)
    public Hotels findById(Long id) {
        return hotelRepository.findById(id).orElse(null); // Return null if not found
    }
}
