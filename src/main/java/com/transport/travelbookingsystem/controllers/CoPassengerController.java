package com.transport.travelbookingsystem.controllers;

import com.transport.travelbookingsystem.services.CoPassengerService;
import com.transport.travelbookingsystem.handlers.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/copassenger")
public class CoPassengerController {

    @Autowired
    private CoPassengerService coPassengerService;

    @GetMapping("/add/{travelPlanId}")
    public String addCoPassenger(@PathVariable("travelPlanId") Long travelPlanId, HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null)
            return "redirect:/login";

        model.addAttribute("travelPlanId", travelPlanId);
        return "addCoPassenger";
    }

    @PostMapping("/add/{travelPlanId}")
    public String addCoPassenger(@PathVariable("travelPlanId") Long travelPlanId,
            @RequestParam("coPassengerName") String coPassengerName,
            @RequestParam("isRegistered") Boolean isRegistered, HttpSession session) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null)
            return "redirect:/login";

        coPassengerService.saveCoPassenger(loggedUser, travelPlanId, coPassengerName, isRegistered);
        return "redirect:/travel/plans";
    }
}
