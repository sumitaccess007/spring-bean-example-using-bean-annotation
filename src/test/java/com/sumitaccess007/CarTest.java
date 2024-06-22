package com.sumitaccess007;

import com.sumitaccess007.config.AppConfig;
import com.sumitaccess007.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {

    @Test
    public void testCarBean() {
        // Load the Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Car bean
        Car car = context.getBean(Car.class);

        // Verify that the bean is not null
        assertNotNull(car, "Car bean should not be null");

        // Verify the initial properties of the Car bean
        assertEquals("Ford", car.getBrand(), "Car brand should be BMW");
        assertEquals("Blue", car.getColor(), "Car color should be Black");

        // Modify the properties of Car bean
        car.setBrand("Audi");
        car.setColor("Red");

        // Verify the modified properties
        assertEquals("Audi", car.getBrand(), "Car brand should be Audi");
        assertEquals("Red", car.getColor(), "Car color should be Red");
    }
}
