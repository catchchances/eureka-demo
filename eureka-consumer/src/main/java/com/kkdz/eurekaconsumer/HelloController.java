package com.kkdz.eurekaconsumer;

import com.kkdz.eurekaprovider.CarClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private CarClient carClient;

    @GetMapping("/buyCar")
    public String buyCar() {
        return carClient.sellCar();
    }

}
