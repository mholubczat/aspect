package com.example.helloAspect.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;


    public Employee(@Value("Name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void throwException() {
        throw new RuntimeException("Error");
    }
}
