package com.example.firstSpringClass.controller;

import com.example.firstSpringClass.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @Autowired
    GreetService greetService;

    // This will give error saying Ambiguous mapping, cannot map 'SecondController' method as there is already 'firstController' method
//    Paths + types  -> class.method
// Type GET with type greet GET+/greet -> FirstController.sayHello
//  in back it gets stored in key value pair so type GET is already n the map +/greet ->  it cannot  map 'SecondController' as there is firstController with same mapping
//    @GetMapping("/greet")
//    public String sayHello2(String name){
    // logger.debug("I am getting called in greet method");
    //logger.error("here is the exception);
//        return greetService.sayHello(name);
//    }
    @PostMapping("/greet")// this will work as now spring know if post is coming with greet we need to call say
    public String sayHello2(String name){
        return greetService.sayHello(name);
    }


    public String sayHi(String name) {

        return greetService.sayHello(name);

    }
}