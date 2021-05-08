package com.example.Library;

import org.springframework.stereotype.Component;

@Component
public class Book {
    String title;
    Integer ISBN;
    String reviews;


    public Book(String title, Integer ISBN, String reviews) {
        this.title = title;
        this.ISBN = ISBN;
        this.reviews = reviews;
    }
}
