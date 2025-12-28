package com.kassandra.runplanner.controller;

import org.springframework.web.bind.annotation.*;
import com.kassandra.runplanner.model.DailyAvailability;
import com.kassandra.runplanner.repository.DailyAvailabilityRepository;

@RestController
public class DailyAvailabilityController {
    private final DailyAvailabilityRepository dARepo;

    public DailyAvailabilityController(DailyAvailabilityRepository dARepo){
        this.dARepo = dARepo;
    }
   
    @GetMapping("/api/health")
    public String getData(){
        return "Get request works!!";
    }

    @PostMapping("/api/availability")
    public DailyAvailability createAvailability (@RequestBody DailyAvailability availability){
        return dARepo.save(availability);
    }


}
