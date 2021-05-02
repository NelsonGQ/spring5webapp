package guru.springframework.spring5webapp.service;

import guru.springframework.spring5webapp.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllBooks();

    Author saveBook(Author author);

    Author getOneBookById(Long id);

}
