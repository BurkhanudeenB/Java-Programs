package com.example.userregistrationapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping ("/hello")
    public String hello() {
        return "Hello Furkhan";
    }
}