package com.kassandra.runplanner.model;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;

@Entity
public class DailyAvailability {
   
    @Id 
    @GeneratedValue
    private Long availabilityId;
    
    @Column(name="run_date")
    private LocalDate day;

    private LocalTime startTime;
    private LocalTime endTime;
    private boolean dayOff;
    private int bufferMinutes;

    public Long getAvailabilityId(){
        return availabilityId;
    }

    public void setAvailabilityId(Long availabilityId){
        this.availabilityId = availabilityId;
    }

    public LocalDate getDay(){
        return day;
    }

    public void setDay(LocalDate day){
        this.day = day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public boolean isDayOff() {
        return dayOff;
    }

    public void setDayOff(boolean dayOff) {
        this.dayOff = dayOff;
    }

    public int getBufferMinutes() {
        return bufferMinutes;
    }

    public void setBufferMinutes(int bufferMinutes) {
        this.bufferMinutes = bufferMinutes;
    }

}
