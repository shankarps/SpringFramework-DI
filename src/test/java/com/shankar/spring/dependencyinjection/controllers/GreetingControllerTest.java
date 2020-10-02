package com.shankar.spring.dependencyinjection.controllers;

import com.shankar.spring.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class GreetingControllerTest {

    @Autowired
    GreetingController greetingController;

    @BeforeEach
    void setup(){
        greetingController = new GreetingController();
        //manually inject the service.
        greetingController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(greetingController.getGreeting());
    }
}