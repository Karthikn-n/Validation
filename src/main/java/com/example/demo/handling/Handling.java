package com.example.demo.handling;

import com.example.demo.object.ObjectErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Handling {

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<?> illegal(IllegalStateException e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(ObjectErrorException.class)
    public ResponseEntity<?> object(ObjectErrorException e){
        return ResponseEntity.badRequest().body(e.getMsg());
    }
}
