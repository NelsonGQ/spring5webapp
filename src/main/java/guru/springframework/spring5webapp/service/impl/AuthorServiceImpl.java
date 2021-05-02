package guru.springframework.spring5webapp.service.impl;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllBooks() {
        return authorRepository.findAll();
    }

    @Override
    public Author saveBook(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author getOneBookById(Long id) {
        return authorRepository.findById(id).get();
    }
}
