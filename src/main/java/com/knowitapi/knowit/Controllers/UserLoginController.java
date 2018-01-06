package com.knowitapi.knowit.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users/login")
public class UserLoginController {

    @RequestMapping(method = RequestMethod.GET)
    private String sayHello(){
        return "Hello Know-it users";
    }
}
