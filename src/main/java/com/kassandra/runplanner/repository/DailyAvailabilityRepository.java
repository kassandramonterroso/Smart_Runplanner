package com.kassandra.runplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kassandra.runplanner.model.DailyAvailability;

public interface DailyAvailabilityRepository extends JpaRepository<DailyAvailability, Long>  {
    
}
