package com.springcore.lifeCycle;

public class Samosa {
    private double price;

    public Samosa() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside init() method");
    }

    public void destroy(){
        System.out.println("Inside destroy() method");
    }
}