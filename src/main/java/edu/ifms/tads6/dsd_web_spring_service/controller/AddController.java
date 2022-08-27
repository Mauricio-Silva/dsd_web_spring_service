package edu.ifms.tads6.dsd_web_spring_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifms.tads6.dsd_web_spring_service.domain.Add;

@RestController
@RequestMapping(value = "/add")
public class AddController {
    
    @GetMapping("/{n1}/{n2}")
    public ResponseEntity<Integer> add(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
        Add add_operation = new Add(n1, n2);
        return ResponseEntity.ok(add_operation.getResult());
    }
}
