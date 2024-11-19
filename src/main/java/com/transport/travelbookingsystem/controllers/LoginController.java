package com.transport.travelbookingsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.transport.travelbookingsystem.handlers.SessionHandler;
import com.transport.travelbookingsystem.services.UserServices;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
    private UserServices userServices;

    public LoginController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/login")
    public String getLoginPage(HttpSession session) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser != null)
            return "redirect:/";

        return "login";
    }

    @PostMapping("/login")
    public String loginUser(String username, String password, HttpSession session) {
        String loggedUser = SessionHandler.getUsernameSession(session);
        if (loggedUser != null)
            return "redirect:/";

        if (userServices.verifyPassword(username, password)) {
            SessionHandler.setUsernameSession(session, username);
            return "redirect:/";
        }

        return "redirect:/login";
    }
}
