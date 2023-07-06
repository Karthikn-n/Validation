package com.example.demo.controller;

import com.example.demo.model.Greet;
import com.example.demo.service.GreetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class Controller {

    private final GreetService service;

    @PostMapping
    public ResponseEntity<String> post(@RequestBody Greet greet){
        final String msg =  service.save(greet);
        return ResponseEntity.accepted().body(msg);
    }
    @GetMapping("/error")
    public ResponseEntity<?> error(){
        return ResponseEntity.ok(service.throwException());
    }




}
