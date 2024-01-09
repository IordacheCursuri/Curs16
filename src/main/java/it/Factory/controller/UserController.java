package it.Factory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{username}")
    public String sayHello(@PathVariable String username) {
        return "HELLO " + username;
    }


}
