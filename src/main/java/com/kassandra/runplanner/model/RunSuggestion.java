package com.kassandra.runplanner.model;

public class RunSuggestion {

    private String suggestion;
    private String reason;

    public RunSuggestion(String suggestion, String reason){
        this.suggestion = suggestion;
        this.reason = reason;
    }

    public String getSuggestion(){
        return suggestion;
    }

    public String getReason(){
        return reason;
    }
    
}
