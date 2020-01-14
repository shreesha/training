package com.example.Training.Views;

import com.example.Training.Model.Training;
import com.example.Training.Model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by pana on 14/01/20.
 */
public class BatchView {

    private String startDate;
    private String endDate;
    private int maxParticipants;


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }
}
