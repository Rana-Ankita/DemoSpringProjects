package com.springcore.autoWiring;

public class Employee {

    private Address address;

    public Employee(Address address) {
        super();
        this.address = address;
        System.out.println("inside constructor");
    }

    public Address getAddress() {
        return address;
    }

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
