package com.transport.travelbookingsystem.services;

import java.time.LocalDateTime;
import java.util.Optional;

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

    public Users insertOneUser(
            String username, String password, String name, String email, String phone_number, String citizenship,
            String aadhar_number, Integer age, String gender, String address) {

        String encryptedPassword = EncryptionHandler.encryptPassword(password);
        LocalDateTime currentTime = LocalDateTime.now();
        Users user = new Users(
                username,
                encryptedPassword,
                name,
                email,
                phone_number,
                citizenship,
                aadhar_number,
                age,
                gender,
                address,
                currentTime, // createdAt
                currentTime // updatedAt
        );

        return userRepository.save(user);
    }

    public Boolean verifyPassword(String username, String password) {
        String actualEncodedPassword = userRepository.getPasswordByUsername(username);
        return password != null && actualEncodedPassword != null
                && EncryptionHandler.matchPassword(password, actualEncodedPassword);
    }

    public Optional<Users> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Optional<Users> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }

}
