package com.example.Training.Model;

/**
 * Created by pana on 13/01/20.
 */
public class Facility {
    private Long facilityId;
    private String type;
    private Boolean isAvailable;
    private String description;


    public Facility(String type, Boolean isAvailable, String description) {
        this.type = type;
        this.isAvailable = isAvailable;
        this.description = description;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
