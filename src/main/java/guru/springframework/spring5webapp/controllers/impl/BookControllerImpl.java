package guru.springframework.spring5webapp.controllers.impl;

import guru.springframework.spring5webapp.controllers.BookController;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookControllerImpl implements BookController {

    @Autowired
    private BookService bookService;

    @Override
    public List<Book> getAllBookList() {
        return bookService.getAllBooks();
    }

    @Override
    public Book saveBook(Book book) {
        return bookService.saveBook(book);
    }

    @Override
    public Book getBookById(Long bookId) {
        return bookService.getOneBookById(bookId);
    }
}
