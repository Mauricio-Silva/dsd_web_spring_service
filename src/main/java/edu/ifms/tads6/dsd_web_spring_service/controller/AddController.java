package edu.ifms.tads6.dsd_web_spring_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifms.tads6.dsd_web_spring_service.model.Add;

@RestController
@RequestMapping(value = "/add")
public class AddController {
    
    @GetMapping("/{n1}/{n2}")
    public Integer add(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
        return new Add(n1, n2).getResult();
    }


    @PostMapping
    public Integer addByPost(@RequestBody Add add) {
        return add.getResult();
    }
}
