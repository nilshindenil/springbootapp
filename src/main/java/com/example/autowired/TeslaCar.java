package com.example.autowired;

import org.springframework.stereotype.Service;

@Service
public class TeslaCar implements Car{
    @Override
    public String driving() {
        return "Driving Tesla car.........";
    }
}
