package com.rfbsoft.springbootsoapexample.service;

import com.rfbsoft.spring_boot_soap_example.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {

    private static final Map<String, Car> cars = new HashMap<>();

    @PostConstruct
    public void initialize() {

        Car bmw = new Car();
        bmw.setName("BMW");
        bmw.setEmpId(1111);
        bmw.setSalary(12000);

        Car mercedes = new Car();
        mercedes.setName("MERCEDES");
        mercedes.setEmpId(1112);
        mercedes.setSalary(32000);
        Car alfaRomeo = new Car();
        alfaRomeo.setName("ALFA ROMEO");
        alfaRomeo.setEmpId(1113);
        alfaRomeo.setSalary(16000);

        cars.put(bmw.getName(), bmw);
        cars.put(mercedes.getName(), mercedes);
        cars.put(alfaRomeo.getName(), alfaRomeo);
    }


    public Car getCars(String name) {
        return cars.get(name);
    }
}
