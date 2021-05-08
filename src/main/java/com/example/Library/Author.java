package com.example.Library;

import org.springframework.stereotype.Component;

@Component
public class Author {
    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
