package com.transport.travelbookingsystem.controllers;

import org.springframework.stereotype.Controller;

import com.transport.travelbookingsystem.handlers.SessionHandler;
import com.transport.travelbookingsystem.services.UserServices;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private UserServices userServices;

    public RegistrationController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/register")
    public String getRegisterPage(HttpSession session) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser != null)
            return "redirect:/";

        return "register";
    }

    @PostMapping("/register")
    public String registerUser(String username, String password, String name, String email, String phone_number, String citizenship,
            String aadhar_number, Integer age, String gender, String address, HttpSession session) {

        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser != null)
            return "redirect:/";
        if ("India".equals(citizenship) && (aadhar_number == null || aadhar_number.isEmpty())) {
            return "redirect:/register?error=aadharRequired";
        }

        userServices.insertOneUser(username, password,name, email, phone_number, citizenship, aadhar_number, age, gender,
                address);

        return "redirect:/login";
    }

}
