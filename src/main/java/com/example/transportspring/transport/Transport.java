package com.example.transportspring.transport;

public class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        System.out.println(model + " готов к работе");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                '}';
    }
}
