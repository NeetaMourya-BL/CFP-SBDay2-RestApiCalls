package com.example.restapicalls.controller;

import com.example.restapicalls.model.UserData;
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
    //curl -X POST -H "Content-Type: application/json" -d '{"firstName": ”Neeta","lastName": ”Mourya"}'
    //"http://localhost:8080/hello/post" -w "\n"
    @PostMapping("/post")
    public String sayHello(@RequestBody UserData user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " From Bridgelabz";
    }
    //curl -X PUT localhost:8080/hello/put/Mark/?lastName=Taylor -w "\n"
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " From Bridgelabz";
    }
}