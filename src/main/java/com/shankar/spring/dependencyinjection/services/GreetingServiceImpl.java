package com.shankar.spring.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//Annotation to denote this is a Spring bean
@Service
@Primary
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
