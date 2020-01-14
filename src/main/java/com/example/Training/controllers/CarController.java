package com.example.Training.controllers;

import com.example.Training.models.CarModel;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pana on 13/01/20.
 */
@RestController
@RequestMapping("/api/v1/cars")
public class CarController {
    @GetMapping("/")
    public String getName(){
        return "Default Car";
    }

    @GetMapping("/single")
    public CarModel getSingleCar(){
        CarModel car = new CarModel("dsdds", 123);
        car.setNumber("1234");
        return car;
    }

    @PostMapping("")
    public CarModel addCar(@RequestBody CarModel newCar){

        return newCar;
    }

    @PutMapping("{year}")
    public CarModel updateCar(@RequestBody CarModel updatedCar, @PathVariable int year ){
        updatedCar.setYear(year);
        return updatedCar;
    }

    @DeleteMapping("{number}")
    public void deleteCar(@PathVariable String number){
        CarModel car = new CarModel("fsfd", 32323);
        car.setNumber(number);

    }


}
