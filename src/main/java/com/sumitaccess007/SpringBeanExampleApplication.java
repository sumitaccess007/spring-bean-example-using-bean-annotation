package com.sumitaccess007;

import com.sumitaccess007.model.Car;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBeanExampleApplication {
    public static void main(String[] args) {

        // STEP-3 - Load the Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanExampleApplication.class);

        // STEP-4 - Retrieve the Bean from the Spring Context
        // Referring to Car Instance by type
        Car car = context.getBean(Car.class);
        System.out.println("Referring Car Instance (or Bean) by type -");
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Brand: " + car.getColor());
        System.out.println();

        // Referring to Bean by its identifier
        Car carFerrari = context.getBean("carFerrari", Car.class);
        System.out.println("Referring Car Instance (or Bean) by its identifier -");
        System.out.println("Car Brand: " + carFerrari.getBrand());
        System.out.println("Car Brand: " + carFerrari.getColor());
        System.out.println();

        // Referring to Bean by its name
        Car carBMW = context.getBean("bmw", Car.class);
        System.out.println("Referring Car Instance (or Bean) by its name -");
        System.out.println("Car Brand: " + carBMW.getBrand());
        System.out.println("Car Brand: " + carBMW.getColor());
        System.out.println();

        // Modify the values dynamically
        car.setBrand("Audi");
        car.setColor("Red");
        System.out.println("Updated Car Brand: " + car.getBrand());
        System.out.println("Updated Car Color: " + car.getColor());
        System.out.println();
    }
}
