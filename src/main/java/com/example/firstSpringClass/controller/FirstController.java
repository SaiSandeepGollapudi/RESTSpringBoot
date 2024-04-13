package com.example.firstSpringClass.controller;


import com.example.firstSpringClass.service.GreetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class FirstController {
// The controller focuses on request handling
    @Autowired//  When you annotate a field, setter method, or constructor with @Autowired, Spring automatically wires (injects) the dependencies/objects created by service
    // into that component at runtime. This dependency injection mechanism allows the controller to use the functionality provided by the service without
        // explicitly creating an instance of it. Spring will look for a bean of type GreetService in its application context.
        // It searches for a bean/instance that implements the GreetService interface and injects it into the greetService field.
        // This bean could be an instance of GreetHelloServiceImpl or any other class that implements the GreetService interface.
    GreetService greetService;

//    Path
// http://localhost:8080/greet?name=Sai
//    step 2  [greet,name=Sai]
//           find a method which is responsible for /greet
         @GetMapping("/greet")
    //@ResponseBody if we use Controller instead of RestController we need to mention this annotation also but RestController has those two annotations combined in it
    public String sayHello(String name) {//If the greeting logic ever needs to change or be extended, you only need to modify the GreetService implementation. The controller remains unchanged,
// promoting easier maintenance and reducing the risk of introducing bugs.
       // is invoking the sayHello() method on the greetService object, passing the name parameter, and returning the result.
        return greetService.sayHello(name);//

    }


}


/**
 *
 1. Someone will call our application.
 2. Controller will be the one to receive the call.
 3. Controller will call service layer based on the input.
 4. Service will act on the data, which includes CRUD operations. -> Create, Read, Update and Delete on Entity / domain
 5. Service will return the data to Controller.
 6. Controller will return the data to the user.
 * */