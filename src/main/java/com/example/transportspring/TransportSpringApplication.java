package com.example.transportspring;

import com.example.transportspring.transport.Bus;
import com.example.transportspring.transport.Car;
import com.example.transportspring.transport.Pickup;
import com.example.transportspring.transport.Transport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TransportSpringApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Transport transportCar = context.getBean("car", Car.class);
        transportCar.start();

        Transport transportBus = context.getBean("bus", Bus.class);
        transportBus.start();

        Transport transportPickup = context.getBean("pickup", Pickup.class);
        transportPickup.start();

        Driver driverCar = context.getBean("driverCar", Driver.class);
        driverCar.startTheCar();

        Driver driverBus = context.getBean("driverBus", Driver.class);
        driverBus.startTheCar();

        Driver driverPickup = context.getBean("driverPickup", Driver.class);
        driverPickup.startTheCar();
    }

}
