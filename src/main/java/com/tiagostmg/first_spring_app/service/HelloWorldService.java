package com.tiagostmg.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name) {
        return "Hello World " + name;
    }
    public String helloWorld(String name, String email) {
        return "Hello World " + name + " asd " + email;
    }
}
