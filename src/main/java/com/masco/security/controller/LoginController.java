package com.masco.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/welcome")
    public String getHelloMessage() {
        return "Hello World";
    }

    @GetMapping("/contactUs")
    public String getContactNumber() {
        return "9465168924";
    }
}
