package com.transport.travelbookingsystem.services;

import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.handlers.EncryptionHandler;
import com.transport.travelbookingsystem.models.Users;
import com.transport.travelbookingsystem.repositories.UserRepository;

@Service
public class UserServices {
    private UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users insertOneUser(String username, String password) {
        return userRepository.save(new Users(username, EncryptionHandler.encryptPassword(password)));
    }

    public Boolean verifyPassword(String username,String password) {
        String actualEncodedPassword = userRepository.getPasswordByUsername(username);
        return password != null && actualEncodedPassword!=null && EncryptionHandler.matchPassword(password, actualEncodedPassword);
    }

}
