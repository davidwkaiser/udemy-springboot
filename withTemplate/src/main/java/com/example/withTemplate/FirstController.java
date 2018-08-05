package com.example.withTemplate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping("/first")
    public String returnFirst(Model model){
        model.addAttribute("message", "Dave is becoming a super expert Developer!!!");
        return "first";
    }
}
