package com.springboot.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hominhquan on 12/30/2015.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
