package com.example.withTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {

    @Autowired
    FirstService firstService;


    @RequestMapping("/first")
    public String returnFirst(Model model){
        model.addAttribute("message", getMessage());
        return "first";
    }

    @RequestMapping("/second/{slug}")
    public String getSlug(@PathVariable(value="slug") String slug, Model model) throws Exception {
        System.out.println(slug);
        System.out.println(!slug.equals("dave"));
        if (!slug.equals("dave")) throw new Exception("We couldn't find a post with "+ slug);

        model.addAttribute("message", getMessage());
        return "second";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest request, Exception exception, Model model){
        return "error";
    }



    String getMessage(){
        return firstService.returnMessage();
    }
}
