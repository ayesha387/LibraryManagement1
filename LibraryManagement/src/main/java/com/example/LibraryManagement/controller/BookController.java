package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.Book;
import com.example.LibraryManagement.model.BookModel;
import com.example.LibraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/saveBook")
    public BookModel saveBook(@RequestBody BookModel bookModel) {
        return bookService.book(bookModel);
    }
}
