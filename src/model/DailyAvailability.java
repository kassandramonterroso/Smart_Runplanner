package com.kassandra.runplanner.model;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;

@Entity
public class DailyAvailability {
    @Id 
    @GeneratedValue
    private Long availabilityId;
    
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean dayOff;
    private int bufferMinutes;
}
