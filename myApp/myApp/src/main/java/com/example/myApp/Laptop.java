package com.example.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary --> use to call this Primarily except Desktop
public class Laptop implements Computer{
    public void compile(){
       System.out.println("This is laptop class");
    }
}
