package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    @Value(("${name}"))
    private String name;


    public String getName() {
        return name;
    }
}
