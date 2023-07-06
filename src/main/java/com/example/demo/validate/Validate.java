package com.example.demo.validate;

import com.example.demo.model.Greet;
import com.example.demo.object.ObjectErrorException;
import jakarta.validation.*;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class Validate<T> {

    private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private Validator validator = factory.getValidator();

    public void validate(T greet){
        Set<ConstraintViolation<T>> violations = validator.validate(greet);
        if (!violations.isEmpty()){
            var me = violations.stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.toSet());
            throw  new ObjectErrorException(me);
        }

    }
}
