package com.portfolio.PortfolioSecurityJWT.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://www.youtube.com/watch?v=X80nJ5T7YpE
@RestController //this doesnt return json but returns a page, use RestController to return json
public class HelloResource {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
