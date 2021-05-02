package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "book", produces = MediaType.APPLICATION_JSON_VALUE)
public interface BookController {

    @GetMapping
    List<Book> getAllBookList();

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Book saveBook(@RequestBody Book book);
}
