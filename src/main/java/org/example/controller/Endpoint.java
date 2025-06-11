package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {
    @RequestMapping("/")
    public String index()
    {
        return "Index main page";
    }
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello";
    }
}
