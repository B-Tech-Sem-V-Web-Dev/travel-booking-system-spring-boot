package com.transport.travelbookingsystem.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.transport.travelbookingsystem.models.Users;
@Repository
public interface UserRepository extends JpaRepository<Users,String>{
    @Query(value = "SELECT password FROM users WHERE username=:username", nativeQuery = true)
    public String getPasswordByUsername(@Param("username")String username);

    Optional<Users> findByUsername(String username);
    Optional<Users> findByEmail(String email);
}
