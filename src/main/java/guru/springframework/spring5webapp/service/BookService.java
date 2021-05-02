package guru.springframework.spring5webapp.service;

import guru.springframework.spring5webapp.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book saveBook(Book book);

    Book getOneBookById(Long id);
}
