package com.example.springbootdemo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloController {
    /*
    @Value("${name123}")
    String name123;
    @Value("${person.name}")
    String name;
    */

    @GetMapping("/test")
    public String test1(){
        /*
        System.out.println("name123" + name123);
        System.out.println("person.name" + name);
        */
        return "hello SpringBootinit";


    }

}
