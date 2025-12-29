package com.kassandra.runplanner.service;

import org.springframework.stereotype.Service;
import com.kassandra.runplanner.model.*;
import com.kassandra.runplanner.repository.*;;

@Service
public class DailyAvailabilityService {

    private final DailyAvailabilityRepository repository;

    public DailyAvailabilityService(DailyAvailabilityRepository repository) {
        this.repository = repository;
    }

    public DailyAvailability save(DailyAvailability availability) {
        return repository.save(availability);
    }

    public Iterable<DailyAvailability> findAll() {
        return repository.findAll();
    }
}
