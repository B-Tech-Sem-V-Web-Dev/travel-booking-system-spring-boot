package com.transport.travelbookingsystem.repositories; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transport.travelbookingsystem.models.BookedTransport;

@Repository
public interface BookedTransportRepository extends JpaRepository<BookedTransport, Long> {
    List<BookedTransport> findByUserId(Long userId);
    List<BookedTransport> findByTravelPlanId(Long travelPlanId);
}
