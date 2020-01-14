package com.example.Training.Model;

/**
 * Created by pana on 13/01/20.
 */
public class Training {
    private Long trainingId;
    private String type;
    private Boolean isActive;
    private String description;

    public Training(String description, String type, Boolean isActive) {
        this.description = description;
        this.type = type;
        this.isActive = isActive;
    }

    public Long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
