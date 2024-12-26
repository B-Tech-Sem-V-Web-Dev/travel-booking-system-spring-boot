package com.transport.travelbookingsystem.controllers;

import com.transport.travelbookingsystem.models.Hotels;
import com.transport.travelbookingsystem.models.HotelBookings;
import com.transport.travelbookingsystem.services.HotelBookingService;
import com.transport.travelbookingsystem.services.HotelService;
import com.transport.travelbookingsystem.handlers.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private HotelBookingService hotelBookingService;

    @GetMapping("/search")
    public String searchHotels(@RequestParam(value = "location", required = false) String location,
            HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null)
            return "redirect:/login";

        List<Hotels> hotels;
        if (location != null && !location.isEmpty()) {
            hotels = hotelService.findByLocation(location);
        } else {
            hotels = hotelService.findByHotelName("");
        }
        model.addAttribute("hotels", hotels);
        model.addAttribute("location", location); 
        return "searchHotels";
    }

    @GetMapping("/book/{hotelId}")
    public String bookHotel(@PathVariable("hotelId") Long hotelId, HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null)
            return "redirect:/login";

        Hotels hotel = hotelService.findById(hotelId);
        if (hotel != null) {
            model.addAttribute("hotel", hotel);
            return "bookHotel"; 
        }
        return "redirect:/hotel/search";
    }

    @PostMapping("/book/{hotelId}")
    public String bookHotel(@PathVariable("hotelId") Long hotelId, @RequestParam("checkInDate") String checkInDate,
            @RequestParam("checkOutDate") String checkOutDate, @RequestParam("roomsBooked") int roomsBooked,
            @RequestParam("travelPlanId") Long travelPlanId, HttpSession session) {

        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null)
            return "redirect:/login";

        hotelBookingService.bookHotel(loggedUser, hotelId, checkInDate, checkOutDate, roomsBooked, travelPlanId);

        return "redirect:/hotel/myBookings";
    }

    @GetMapping("/myBookings")
    public String viewMyHotelBookings(HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null)
            return "redirect:/login";

        List<HotelBookings> hotelBookings = hotelBookingService.getBookingsByUsername(loggedUser);
        model.addAttribute("hotelBookings", hotelBookings);
        return "viewHotelBookings";
    }
}
