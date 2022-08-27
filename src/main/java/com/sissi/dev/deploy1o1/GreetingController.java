package com.sissi.dev.deploy1o1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("greeting")
    public String greeting() {

        return "Hello, world! Greeting from Azure";
    }
}