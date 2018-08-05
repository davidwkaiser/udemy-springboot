package com.example.withTemplate;

import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public String returnMessage(){
        String message = "Dave is becoming a super expert Developer!!!";
        return message;
    }
}
