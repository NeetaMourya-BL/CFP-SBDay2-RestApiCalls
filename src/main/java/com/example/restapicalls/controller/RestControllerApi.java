package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestControllerApi {
    @RequestMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello From Bridgelabz..";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(name= "name")String name){
        return "Hello "+ name +" From Bridgelabz";
    }
}