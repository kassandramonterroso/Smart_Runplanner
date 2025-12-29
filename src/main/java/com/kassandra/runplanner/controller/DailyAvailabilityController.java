package com.kassandra.runplanner.controller;

import org.springframework.web.bind.annotation.*;
import com.kassandra.runplanner.model.DailyAvailability;
import com.kassandra.runplanner.service.DailyAvailabilityService;

@RestController
public class DailyAvailabilityController {
    private final DailyAvailabilityService service;

    public DailyAvailabilityController(DailyAvailabilityService service){
        this.service = service;
    }
   
    @GetMapping("/api/availability")
    public Iterable<DailyAvailability> getAllAvailability(){
        return service.findAll();
    }

    @PostMapping("/api/availability")
    public DailyAvailability createAvailability (@RequestBody DailyAvailability availability){
        return service.save(availability);
    }


}
