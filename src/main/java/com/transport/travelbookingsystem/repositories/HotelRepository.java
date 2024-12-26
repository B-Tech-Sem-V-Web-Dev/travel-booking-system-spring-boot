package com.transport.travelbookingsystem.repositories; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transport.travelbookingsystem.models.Hotels;

@Repository
public interface HotelRepository extends JpaRepository<Hotels, Long> {
    List<Hotels> findByLocation(String location);
    List<Hotels> findByHotelName(String hotelName);
}
