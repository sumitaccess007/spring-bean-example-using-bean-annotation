package com.sumitaccess007.config;

import com.sumitaccess007.model.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// STEP-1 - Create a Configuration class
@Configuration
public class AppConfig {

    // STEP-2 - Define a Bean Method (1. car)
    @Bean(name = "bmw")
    public Car car() {
        Car car = new Car();
        car.setBrand("BMW");
        car.setColor("Black");
        return car;
    }

    // Some more beans of Car type (2. carBentley)
    @Bean
    public Car carBentley() {
        Car car = new Car();
        car.setBrand("Bentley");
        car.setColor("Grey");
        return car();
    }

    // Third Bean of Car type (3. carFerrari)
    @Bean
    public Car carFerrari() {
        Car car = new Car();
        car.setBrand("Ferrari");
        car.setColor("Red");
        return car;
    }

    // Fourth Bean of Car type (4. Ford)
    // If bean will be referred by type, then this will be returned as it is defined as Primary
    @Bean
    @Primary
    public Car carFord() {
        Car car = new Car();
        car.setBrand("Ford");
        car.setColor("Blue");
        return car;
    }

    // Fifth Bean of Car type (5. Fiat)
    // If bean will be referred by name - fiat, then this will be returned as it is defined with name fiat
    @Bean(name = "fiat")
    public Car carFiat() {
        Car car = new Car();
        car.setBrand("Fiat");
        car.setColor("Orange");
        return car;
    }
}
