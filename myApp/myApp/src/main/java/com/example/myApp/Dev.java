package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
  @Autowired // Field Injection //only writing autowired is field injection
  @Qualifier("laptop") //Use to call class needed. it's also declined primary annotation if we are using this.

    private Computer comp;

//Dev(Laptop laptop){ --> Constructor Injection //here autowired is optional
//    this.laptop=laptop;
//}

//    @Autowired
//    public void set(Laptop laptop){ --> Setter Injection
//        this.laptop=laptop;
//    }
    public void build(){
        comp.compile();
        System.out.println("Spring Boot is the best framework");
    }
}
