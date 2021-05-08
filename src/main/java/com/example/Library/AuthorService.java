package com.example.Library;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorService {
    List<Author> author =  new ArrayList<>();
     void addAuthor(String firstName,String lastName){
         author.add(new Author(firstName,lastName));

    }
}
