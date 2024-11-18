package com.transport.travelbookingsystem.handlers;

import jakarta.servlet.http.HttpSession;

public class SessionHandler {
    private static Boolean checkSession(HttpSession session,String key){
        return session!=null && session.getAttribute(key)!=null;
    }

    public static Boolean setUsernameSession(HttpSession session,String username){
        try {
            session.setAttribute("username", username);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static String getUsernameSession(HttpSession session){
        if(checkSession(session, "username")) return (String)session.getAttribute("username");
        return null;
    }
}
