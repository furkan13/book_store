package com.example.Book.Store.repository;

import com.example.Book.Store.entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Optional<Book> findByISBN (int ISBN);

}
