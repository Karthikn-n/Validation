package com.example.demo.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greet {

    @NotNull(message = "MESSAGE must not be empty")
    @NotEmpty(message = "MESSAGE must not be empty")
    private String msg;

    @NotNull(message = "FROM must not be empty")
    @NotEmpty(message = "FROM must not be empty")
    private String from;

    @NotNull(message = "TO must not be empty")
    @NotEmpty(message = "TO must not be empty")
    private String to;

}
