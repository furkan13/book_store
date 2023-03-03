package com.example.Book.Store.Services;

import com.example.Book.Store.entites.Book;

import java.util.List;

public interface BookService {
 public List<Book> findAll ();

 public Book findById (int id);

 public void save (Book book);

 public void deleteAll ();

 public void deleteById (int id);

 public Book findByISBN (int ISBN);


}
