package com.transport.travelbookingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.models.BookedTransport;
import com.transport.travelbookingsystem.repositories.BookedTransportRepository;

import java.util.List;

@Service
public class BookedTransportService {

    @Autowired
    private BookedTransportRepository bookedTransportRepository;

    public List<BookedTransport> findByTravelPlanId(Long travelPlanId) {
        return bookedTransportRepository.findByTravelPlanId(travelPlanId);
    }

    public BookedTransport saveBookedTransport(BookedTransport bookedTransport) {
        return bookedTransportRepository.save(bookedTransport);
    }

    public void deleteBookedTransport(Long id) {
        bookedTransportRepository.deleteById(id);
    }
}
