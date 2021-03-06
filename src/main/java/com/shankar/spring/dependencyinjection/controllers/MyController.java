package com.shankar.spring.dependencyinjection.controllers;

import com.shankar.spring.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//Annotation to denote a Spring Bean
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(@Qualifier("germanGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
