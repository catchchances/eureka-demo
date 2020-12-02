package com.kkdz.eurekaprovider;


public class CarClientHystrixFallback implements CarClient{

    @Override
    public String sellCar() {
        return "error machine";
    }



}
