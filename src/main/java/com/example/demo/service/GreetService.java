package com.example.demo.service;

import com.example.demo.model.Greet;
import com.example.demo.validate.Validate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetService {


    private final Validate validator;
    public String save(Greet greet) {
        validator.validate(greet);

        return "This is a Random Message : " +
                greet.getMsg()+
                "I Am the sender" +
                greet.getFrom() +
                "I want to send message to" +
                greet.getTo();

    }

    public String throwException(){
        throw new IllegalStateException("Something happened");
    }
}
