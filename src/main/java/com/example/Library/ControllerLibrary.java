package com.example.Library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerLibrary {
    private final BookService bookService;
    private final AuthorService authorService;
    List<Book> books =  new ArrayList<>();
    List<Author> author =  new ArrayList<>();
    ControllerLibrary(BookService bookService,AuthorService authorService){
        this.bookService=bookService;
        this.authorService=authorService;

    }


    @GetMapping("/addBook/{title}/{isbn}")
    @ResponseBody
    String add(@PathVariable()String title,@PathVariable()String isbn){
        books.add(new Book(title,isbn));
        return isbn;
    }
    @GetMapping("/addAuthor")
    @ResponseBody
    String add2(
                @RequestParam String firstName,
                @RequestParam String lastName) {
        author.add((new Author(firstName,lastName)));
        return String.format("Dane autora: imie=%s, nazwisko=%s", firstName, lastName);

    }



}
