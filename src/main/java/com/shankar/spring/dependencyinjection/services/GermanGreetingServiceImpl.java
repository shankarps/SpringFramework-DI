package com.shankar.spring.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GermanGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo Welt";
    }
}
