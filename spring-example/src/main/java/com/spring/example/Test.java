package com.spring.example; // Package declaration

// Importing Spring Framework classes for application context management
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        // Creating a Spring container and loading the configuration from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        // The above line initializes the Spring container and loads the beans
    }
}
