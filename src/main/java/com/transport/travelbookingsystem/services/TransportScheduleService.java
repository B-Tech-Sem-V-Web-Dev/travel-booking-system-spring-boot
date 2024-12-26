package com.transport.travelbookingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.travelbookingsystem.models.TransportSchedules;
import com.transport.travelbookingsystem.repositories.TransportScheduleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TransportScheduleService {

    @Autowired
    private TransportScheduleRepository transportScheduleRepository;


    public Optional<TransportSchedules> findById(Long id) {
        return transportScheduleRepository.findById(id);
    }

    public List<TransportSchedules> findByDestination(String destination) {
        return transportScheduleRepository.findByDestination(destination);
    }

    public List<TransportSchedules> findBySourceAndDestination(String source, String destination) {
        return transportScheduleRepository.findBySourceAndDestination(source, destination);
    }

    public List<TransportSchedules> findByMedium(String medium) {
        return transportScheduleRepository.findByMedium(medium);
    }

    public TransportSchedules saveTransportSchedule(TransportSchedules transportSchedule) {
        return transportScheduleRepository.save(transportSchedule);
    }

    public void deleteTransportSchedule(Long id) {
        transportScheduleRepository.deleteById(id);
    }

    public List<TransportSchedules> getAll(){
        return transportScheduleRepository.getAll();
    }
}
