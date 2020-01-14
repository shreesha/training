package com.example.Training.Model;

/**
 * Created by pana on 13/01/20.
 */
public class User {
    private Long userId;
    private String name;
    private UserType type;
    private String contactNumber;
    private String emailId;

    public User(String name, UserType type, String contactNumber, String emailId) {
        this.name = name;
        this.type = type;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
