package com.transport.travelbookingsystem.controllers;

import com.transport.travelbookingsystem.models.Users;
import com.transport.travelbookingsystem.services.UserServices;
import com.transport.travelbookingsystem.handlers.SessionHandler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices userService;

    @GetMapping("/profile")
    public String getProfile(HttpSession session, Model model) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser == null)
            return "redirect:/login";
        Optional<Users> userOptional = userService.findByUsername(loggedUser);
        if (userOptional.isEmpty()) {
            return "redirect:/login";
        }
        Users user = userOptional.get();
        model.addAttribute("user", user);
        return "profile";
    }
}
