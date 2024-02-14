package com.springcore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class IceCream {

    private String brand;

    public IceCream(){
        super();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @PostConstruct
    public void start(){
        System.out.println("starting method");
    }

    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }


    @Override
    public String toString() {
        return "IceCream{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
