package com.transport.travelbookingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.models.Hotels;
import com.transport.travelbookingsystem.repositories.HotelRepository;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotels> findByLocation(String location) {
        return hotelRepository.findByLocation(location);
    }

    public List<Hotels> findByHotelName(String hotelName) {
        return hotelRepository.findByHotelName(hotelName);
    }

    public Hotels saveHotel(Hotels hotel) {
        return hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }
}
