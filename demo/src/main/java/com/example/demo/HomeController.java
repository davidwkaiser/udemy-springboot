package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @Value("${cat}")
    private String cat;

    @Autowired
    FirstService firstService;

    @RequestMapping("/")
    public String home(){
        return "this app is named "+ showName() + " and it belongs to "+ getCat();
    }


    String showName(){

        return firstService.getName();
    }

    String getCat(){

        return cat;
    }
}