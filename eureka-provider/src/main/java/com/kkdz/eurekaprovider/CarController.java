package com.kkdz.eurekaprovider;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @PostMapping("/sellCar")
    public String sellCar() {
        return "BMW";
    }

}