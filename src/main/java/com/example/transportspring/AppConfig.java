package com.example.transportspring;

import com.example.transportspring.transport.Bus;
import com.example.transportspring.transport.Car;
import com.example.transportspring.transport.Pickup;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("Автомобиль");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("Автобус");
    }

    @Bean (name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("Пикап");
    }

    @Bean(name = "driverCar")
    public Driver getCarDriver() {
        return new Driver("Вася" , getCarBean());
    }

    @Bean(name = "driverBus")
    public Driver getBusDriver() {
        return new Driver("Петя" , getBusBean());
    }

    @Bean(name = "driverPickup")
    public Driver getPickupDriver() {
        return new Driver("Коля" , getPickupBean());
    }
}
