package com.example.SimpleWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller we can use this when we are using ResponseBody Annotation
@RestController

public class HomeController {
  //  @ResponseBody
    @RequestMapping("/")
    public String greet(){
        return "Hi I am Vibha";
    }
    @RequestMapping("/about")
    public String about(){
        return "Working on project";
    }
}
