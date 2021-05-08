package com.example.Library;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookService {
    List<Book> books =  new ArrayList<>();
     void addBook(String title,String isbn){
         books.add(new Book(title,isbn));

    }
}
