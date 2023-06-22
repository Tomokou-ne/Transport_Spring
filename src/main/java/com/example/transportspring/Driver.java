package com.example.transportspring;

import com.example.transportspring.transport.Transport;

public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void startTheCar() {
        System.out.println(name + " сел(а) в " + transport.getModel());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport =" + transport +
                '}';
    }
}
