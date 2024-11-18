package com.transport.travelbookingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.transport.travelbookingsystem.models.Users;

public interface UserRepository extends JpaRepository<Users,String>{
    @Query(value = "SELECT password FROM users WHERE username=:username", nativeQuery = true)
    public String getPasswordByUsername(@Param("username")String username);
}
