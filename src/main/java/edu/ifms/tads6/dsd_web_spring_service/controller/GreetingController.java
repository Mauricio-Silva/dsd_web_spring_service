package edu.ifms.tads6.dsd_web_spring_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifms.tads6.dsd_web_spring_service.domain.Greeting;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {
    
    @GetMapping
    public ResponseEntity<String> sayHello() {
        Greeting greeting = new Greeting("Hello, World!");
        return ResponseEntity.ok(greeting.getGreeting());
    }
}
