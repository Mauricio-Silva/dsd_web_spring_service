package edu.ifms.tads6.dsd_web_spring_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sum")
public class SumController {
    
    @GetMapping("/{n1}/{n2}")
    public ResponseEntity<Double> add(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        double newN1 = 0;
        try {
            newN1 = Double.parseDouble(n1);
        } catch (NumberFormatException nfe) {
            throw new ArithmeticException("Invalid value! the first param must be a number");
        }
        double newN2 = 0;
        try {
            newN2 = Double.parseDouble(n2);
        } catch (NumberFormatException nfe) {
            throw new ArithmeticException("Invalid value! the second param must be a number");
        }
        return ResponseEntity.ok(newN1 + newN2);
    }
}
