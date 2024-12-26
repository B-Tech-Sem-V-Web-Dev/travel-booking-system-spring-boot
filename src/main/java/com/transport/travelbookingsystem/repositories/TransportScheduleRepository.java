package com.transport.travelbookingsystem.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transport.travelbookingsystem.models.TransportSchedules;

import java.util.List;

@Repository
public interface TransportScheduleRepository extends JpaRepository<TransportSchedules, Long> {
    List<TransportSchedules> findByDestination(String destination);
    List<TransportSchedules> findBySourceAndDestination(String source, String destination);
    List<TransportSchedules> findByMedium(String medium);
}
