package com.transport.travelbookingsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.transport.travelbookingsystem.handlers.SessionHandler;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePage(HttpSession session) {
        String loggedUser=SessionHandler.getUsernameSession(session);
        if(loggedUser==null) return "redirect:/login";
        
        return "home";
    }
    
}
