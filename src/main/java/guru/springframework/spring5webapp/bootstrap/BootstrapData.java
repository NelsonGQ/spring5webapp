package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author firstAuthor = new Author("Jake","Evans");
        Book firstBook = new Book("How to be a Dragon","56789");
        Publisher firstPublisher = new Publisher("Jill INC","Some Street","Some City","Some State","B2490");
        firstAuthor.getBooks().add(firstBook);
        firstBook.getAuthors().add(firstAuthor);
        firstPublisher.getBooks().add(firstBook);

        authorRepository.save(firstAuthor);
        bookRepository.save(firstBook);
        publisherRepository.save(firstPublisher);

        Author secondAuthor = new Author("Rod","Johnson");
        Book secondBook = new Book("J2EE Development without EJB","87967");
        Publisher secondPublisher = new Publisher("Test Publisher","Some Street","Some City","Some State","N7692");
        secondAuthor.getBooks().add(secondBook);
        secondBook.getAuthors().add(secondAuthor);
        secondPublisher.getBooks().add(secondBook);

        authorRepository.save(secondAuthor);
        bookRepository.save(secondBook);
        publisherRepository.save(secondPublisher);

        System.out.println("Started the following:");
        System.out.println("Number of books: "+bookRepository.count());
        System.out.println("Number of publishers: "+publisherRepository.count());

    }
}
