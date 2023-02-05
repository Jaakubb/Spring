package com.example.demo;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(path = "/employee")
public class Employee {




        @GetMapping(path = "/getData")
        private String getData(){
            return "data";
        }

        @PostMapping(path = "/register")
        private String registerUser(@RequestBody User user) {
            return "Zarejstrowano pracownika";
        }
}
