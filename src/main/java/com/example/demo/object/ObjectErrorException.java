package com.example.demo.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor

public class ObjectErrorException extends RuntimeException {


    private final Set<String> msg;
}
