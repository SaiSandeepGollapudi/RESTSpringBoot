package com.example.firstSpringClass.service.Impl;

import com.example.firstSpringClass.service.GreetService;
import org.springframework.stereotype.Service;

@Service
public class GreetHelloServiceImpl implements GreetService {

    GreetHelloServiceImpl(){ //overriding the default constructor
        // This message will be printed when an instance of GreetHelloServiceImpl is created
        System.out.println("I am getting created.");
    }


    @Override
    public String sayHello(String name) {
        return  "Hello " + name;
    }
}