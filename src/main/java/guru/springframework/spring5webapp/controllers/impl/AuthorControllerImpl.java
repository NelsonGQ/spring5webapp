package guru.springframework.spring5webapp.controllers.impl;

import guru.springframework.spring5webapp.controllers.AuthorController;
import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorControllerImpl implements AuthorController {

    @Autowired
    private AuthorService authorService;

    @Override
    public List<Author> getAllAuthorList() {
        return authorService.getAllBooks();
    }

    @Override
    public Author saveAuthor(Author author) {
        return authorService.saveBook(author);
    }

    @Override
    public Author getAuthorById(Long authorId) {
        return authorService.getOneBookById(authorId);
    }
}
