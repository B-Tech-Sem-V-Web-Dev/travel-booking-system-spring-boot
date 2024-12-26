package com.transport.travelbookingsystem.controllers;

import com.transport.travelbookingsystem.models.TransportSchedules;
import com.transport.travelbookingsystem.models.TravelPlans;
import com.transport.travelbookingsystem.services.TransportScheduleService;
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
    @Autowired
    private TransportScheduleService transportScheduleService;


    @GetMapping("/create")
    public String createTravelPlanPage(HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null) return "redirect:/login";  

        model.addAttribute("loggedUser", loggedUser);
        System.out.println(transportScheduleService.getAll());
        model.addAttribute("mediumOfTravels", transportScheduleService.getAll());
        return "bookingform";  // This is the form page where users can fill in travel details
    }

    
    @PostMapping("/create")
    public String createTravelPlan(String username,String destination,Long mediumOfTravelId,Long hotelId, HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null) return "redirect:/login";  

        TravelPlans travelPlan=new TravelPlans(username,destination,mediumOfTravelId,hotelId);
        travelPlan.setUsername(loggedUser);
        TravelPlans createdTravelPlan = travelPlanService.saveTravelPlan(travelPlan);

        
        model.addAttribute("travelPlan", createdTravelPlan);
        Long travelPlanId=createdTravelPlan.getId();
        return "redirect:/travel/plans/"+travelPlanId;  
    }

    @GetMapping("/plans")
    public String viewTravelPlans(HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null) return "redirect:/login";  
       
        List<TravelPlans> travelPlans = travelPlanService.findByUser(loggedUser);
        model.addAttribute("currentPlan",travelPlans.isEmpty()?null:travelPlans.removeLast());
        model.addAttribute("previousPlans", travelPlans);
        return "viewTravelPlans";  
    }

    @GetMapping("/plans/{id}")
    public String viewTravelPlanDetails(@PathVariable("id") Long travelPlanId, HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null) return "redirect:/login"; 
    
        
        Optional<TravelPlans> optionalTravelPlan = travelPlanService.findById(travelPlanId);
    
        if (optionalTravelPlan.isPresent()) {
            
            TravelPlans travelPlan = optionalTravelPlan.get();
            Optional<TransportSchedules> optionalTransportSchedule=transportScheduleService.findById(travelPlan.getMediumOfTravelId());
            model.addAttribute("mediumOfTravel",optionalTransportSchedule.get());
            model.addAttribute("travelPlan", travelPlan);
            return "viewTravelPlan";  
        } else {
           
            model.addAttribute("errorMessage", "Travel plan not found");
            return "errorPage";  
        }
    }
    
}
