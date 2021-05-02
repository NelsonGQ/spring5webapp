package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "author",produces = MediaType.APPLICATION_JSON_VALUE)
public interface AuthorController {

    @GetMapping
    List<Author> getAllAuthorList();

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Author saveAuthor(@RequestBody Author author);

    @GetMapping("/{bookId}")
    Author getAuthorById(@PathVariable Long authorId);

}
