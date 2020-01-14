package com.example.Training.models;

/**
 * Created by pana on 13/01/20.
 */
public class CarModel {
    private String number;
    private int year;

    public CarModel(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public CarModel() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
