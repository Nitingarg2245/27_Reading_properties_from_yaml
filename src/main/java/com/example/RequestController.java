package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @Autowired
    private AppProperties appProperties;

    @GetMapping("/welcome")
    public String welcomeMsg(){
        return appProperties.getMessages().get(AppConstants.WELCOME);
    }
    @GetMapping("/greet")
    public String greetMsg(){
        return appProperties.getMessages().get(AppConstants.GREET);
    }
}
