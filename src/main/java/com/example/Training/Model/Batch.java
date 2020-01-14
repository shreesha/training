package com.example.Training.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by pana on 13/01/20.
 */
@Component
public class Batch {
    private Long batchNumber;
    private Date startDate;
    private Date endDate;
    @Autowired
    private Training training;
    private int maxParticipants;
    @Autowired
    public User trainier;

    public Batch() {
        this.startDate = new Date();
        this.endDate = new Date();
        this.maxParticipants = 100;
    }

    public Batch(Date startDate, Date endDate,  int maxParticipants) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxParticipants = maxParticipants;

    }

    public Long getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public User getTrainier() {
        return trainier;
    }
}
