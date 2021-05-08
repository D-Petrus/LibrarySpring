package com.example.Library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerLibrary {
    private final BookService bookService;
    List<Book> books =  new ArrayList<>();
    ControllerLibrary(BookService bookService){
        this.bookService=bookService;
    }

    @GetMapping("/addBook/{title}/{isbn}")
    @ResponseBody
    String add(@PathVariable()String title,@PathVariable()String isbn){
        books.add(new Book(title,isbn));
        return isbn;
    }



}
