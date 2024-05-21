package com.example.controller;

import com.example.autowired.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private Car car;

    @Lookup("sedanCar")
    public Car getCar() {
        return car;
    }
   /* @Autowired
    @Qualifier("sedanCar")
    private Car car;*/

   /* @Resource
    @Qualifier("teslaCar")
    private Car car; //byType*/

    /*@Autowired
    public void setCar(@Qualifier("teslaCar") Car car) {
        this.car = car;
    }*/

   /* @Autowired
    public CarController(@Qualifier("sedanCar") Car car) {
        this.car = car;
    }*/

    @GetMapping
    public String drive(){
        return car.driving();
    }

}
