package com.springcore.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    //Primitive values in expression
    @Value("#{22+10}")
    private  int x;
    @Value("#{2+5}")
    private int y;

    //use of static method in expression
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private int z;

    //use of static variable in expression
    @Value("#{T(java.lang.Math).PI}")
    private double e;

    // create object in expression
    @Value("#{new java.lang.String('Ankita')}")
    private String name;

    //use boolean with expression
    @Value("#{8>3}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
