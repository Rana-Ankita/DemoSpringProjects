package com.springcore.autoWiring.autowireAnnotaition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired
    @Qualifier("address1")
    private Address address;

    //@Autowired
    public Employee(Address address) {
        super();
        this.address = address;
        System.out.println("inside constructor");
    }

    public Address getAddress() {
        return address;
    }

    //@Autowired
    public void setAddress(Address address) {
        System.out.println("Setting values");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
