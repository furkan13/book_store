package com.example.Book.Store.Services.ServiceImplementation;

import com.example.Book.Store.Services.BookService;
import com.example.Book.Store.entites.Book;
import com.example.Book.Store.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll () {
        return bookRepository.findAll();
    }

    @Override
    public Book findById (int id) {
        Optional<Book> result = bookRepository.findById(id);

        Book theBook = null;

        if (result.isPresent()) {
            theBook = result.get();
        } else {
            // we didn't find the book
            throw new RuntimeException("Did not find Book - " + id);
        }

        return theBook;
    }

    @Override
    public void save (Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteAll () {
        bookRepository.deleteAll();
    }

    @Override
    public void deleteById (int id) {
        bookRepository.deleteById(id);
    }


    @Override
    public Book findByISBN (int ISBN) {
        Optional<Book> result = bookRepository.findByISBN(ISBN);

        Book theBook = null;

        if (result.isPresent()) {
            theBook = result.get();
        } else {
            // we didn't find the book
            throw new RuntimeException("Did not find Book " + ISBN);
        }

        return theBook;
    }


}
