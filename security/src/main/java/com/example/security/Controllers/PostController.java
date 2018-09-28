package com.example.security.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    @RequestMapping("/lists")
    public String list(){
        return "lalalalala";
    }
}
