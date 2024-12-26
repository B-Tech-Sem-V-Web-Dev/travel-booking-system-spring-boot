package com.transport.travelbookingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.models.HotelBookings;
import com.transport.travelbookingsystem.models.Hotels;
import com.transport.travelbookingsystem.repositories.HotelBookingRepository;
import com.transport.travelbookingsystem.repositories.HotelRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class HotelBookingService {

    @Autowired
    private HotelBookingRepository hotelBookingRepository;

    @Autowired
    private HotelRepository hotelRepository;

    // Find bookings by travel plan ID
    public List<HotelBookings> findByTravelPlanId(Long travelPlanId) {
        return hotelBookingRepository.findByTravelPlanId(travelPlanId);
    }

    // Save or update a hotel booking (including calculating total price)
    public HotelBookings saveHotelBooking(HotelBookings hotelBooking) {
        hotelBooking.setCreatedAt(LocalDateTime.now());
        hotelBooking.setUpdatedAt(LocalDateTime.now());
        return hotelBookingRepository.save(hotelBooking);
    }

    // Delete a hotel booking by ID
    public void deleteHotelBooking(Long id) {
        hotelBookingRepository.deleteById(id);
    }

    // Book a hotel: Takes username, hotelId, check-in and check-out dates, and travelPlanId
    public void bookHotel(String username, Long hotelId, String checkInDate, String checkOutDate, int roomsBooked, Long travelPlanId) {
        // Fetch hotel details
        Hotels hotel = hotelRepository.findById(hotelId).orElse(null);

        if (hotel != null) {
            // Calculate total price (example: multiplying roomsBooked by price per night)
            Double pricePerNight = hotel.getPricePerNight(); // assuming hotel has price per night
            Double totalPrice = pricePerNight*(Double.valueOf(roomsBooked));

            // Create and save the booking
            HotelBookings hotelBooking = new HotelBookings();
            hotelBooking.setUsername(username);
            hotelBooking.setHotelId(hotelId);
            hotelBooking.setTravelPlanId(travelPlanId); // Use the provided travel plan ID
            hotelBooking.setCheckInDate(LocalDate.parse(checkInDate));
            hotelBooking.setCheckOutDate(LocalDate.parse(checkOutDate));
            hotelBooking.setRoomsBooked(roomsBooked);
            hotelBooking.setTotalPrice(totalPrice);
            hotelBooking.setCreatedAt(LocalDateTime.now());
            hotelBooking.setUpdatedAt(LocalDateTime.now());

            // Save booking
            hotelBookingRepository.save(hotelBooking);
        }
    }

    // Get all hotel bookings by username
    public List<HotelBookings> getBookingsByUsername(String username) {
        return hotelBookingRepository.findByUsername(username);
    }
}
