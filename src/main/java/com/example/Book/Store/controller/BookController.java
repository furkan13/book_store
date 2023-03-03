package com.example.Book.Store.controller;

import com.example.Book.Store.Services.BookService;
import com.example.Book.Store.entites.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/show-all-books")
    public ModelAndView showAll (Model model) {

        ModelAndView modelAndView = new ModelAndView("/ShowAll");
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        modelAndView.addObject(model);
        return modelAndView;

    }

    @GetMapping("/add-book")
    public ModelAndView addBook (@ModelAttribute("Book") Book book) {

        ModelAndView modelAndView = new ModelAndView("/AddBook");
        modelAndView.addObject(book);
        return modelAndView;
    }

    @PostMapping("/add-book")
    public ModelAndView saveBook (@ModelAttribute("Book") Book book) {
        bookService.save(book);
        return new ModelAndView("redirect:/add-book");

    }
}
