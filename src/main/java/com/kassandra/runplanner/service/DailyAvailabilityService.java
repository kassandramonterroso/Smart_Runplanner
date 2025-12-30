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

    public RunSuggestion suggestRun(DailyAvailability availability){
        
        if (availability.getSorenessLevel() == SorenessLevel.HIGH){
            return new RunSuggestion(
                "RECOVERY_RUN",
                "High soreness - prioritize recovery"
            );
        }

        if (availability.isDayOff()){
            
            if(availability.getEnergyLevel() == EnergyLevel.LOW){
                return new RunSuggestion(
                    "RECOVERY_RUN",
                    "Low energy on a day off - focus on recovery");
            }
            return new RunSuggestion(
                "LONG_RUN",
                "It's a day off, so you have more time to recover");
        }
        return new RunSuggestion(
            "RUN",
            "Work day so a regular run fits better"
        );
    }
}
