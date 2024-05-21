package com.example.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Primary
@Service
@Scope(scopeName = "prototype")
public class SedanCar implements Car{
    @Override
    public String driving() {
        return "Driving Sedan car......";
    }
}
