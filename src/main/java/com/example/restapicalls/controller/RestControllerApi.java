package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class RestControllerApi {
    //curl localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello From Bridgelabz..";
    }
    //curl localhost:8080/hello/query?name=Neeta-w "\n"
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(name= "name")String name){
        return "Hello "+ name +" From Bridgelabz";
    }
    //curl localhost:8080/hello/param/Neeta -w"\n"
    @GetMapping("/param/{name}")
    public String sayHelloPara(@PathVariable String name) {
        return "Hello " + name + " From Bridgelabz";
    }
}