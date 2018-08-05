package com.example.withTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @Autowired
    FirstService firstService;


    @RequestMapping("/first")
    public String returnFirst(Model model){
        model.addAttribute("message", getMessage());
        return "first";
    }

    String getMessage(){
        return firstService.returnMessage();
    }
}
