package com.transport.travelbookingsystem.handlers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptionHandler {
    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String encryptPassword(String rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }

    public static Boolean matchPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
