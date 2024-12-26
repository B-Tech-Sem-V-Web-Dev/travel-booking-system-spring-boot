package com.transport.travelbookingsystem.controllers;

import com.transport.travelbookingsystem.models.TravelPlans;
import com.transport.travelbookingsystem.services.TravelPlanService;
import com.transport.travelbookingsystem.handlers.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/travel")
public class TravelPlanController {

    @Autowired
    private TravelPlanService travelPlanService;


    @GetMapping("/create")
    public String createTravelPlanPage(HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null) return "redirect:/login";  

        model.addAttribute("loggedUser", loggedUser);
        return "createTravelPlan";  // This is the form page where users can fill in travel details
    }

    
    @PostMapping("/create")
    public String createTravelPlan(@ModelAttribute TravelPlans travelPlan, HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null) return "redirect:/login";  

        
        travelPlan.setUsername(loggedUser);
        TravelPlans createdTravelPlan = travelPlanService.saveTravelPlan(travelPlan);

        
        model.addAttribute("travelPlan", createdTravelPlan);
        return "viewTravelPlan";  
    }

    @GetMapping("/plans")
    public String viewTravelPlans(HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null) return "redirect:/login";  
       
        List<TravelPlans> travelPlans = travelPlanService.findByUser(loggedUser);
        model.addAttribute("travelPlans", travelPlans);
        return "viewTravelPlans";  
    }

    @GetMapping("/plans/{id}")
    public String viewTravelPlanDetails(@PathVariable("id") Long travelPlanId, HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null) return "redirect:/login"; 
    
        
        Optional<TravelPlans> optionalTravelPlan = travelPlanService.findById(travelPlanId);
    
        if (optionalTravelPlan.isPresent()) {
            
            TravelPlans travelPlan = optionalTravelPlan.get();
            model.addAttribute("travelPlan", travelPlan);
            return "viewTravelPlan";  
        } else {
           
            model.addAttribute("errorMessage", "Travel plan not found");
            return "errorPage";  
        }
    }
    
}
