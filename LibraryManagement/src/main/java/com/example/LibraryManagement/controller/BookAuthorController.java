package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.BookAuthor;
import com.example.LibraryManagement.service.BookAuthorService;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAuthorController {
    @Autowired
    private BookAuthorService bookAuthorService;

    @PostMapping("/saveBookAuthor")
    public BookAuthor saveBookAuthor(@RequestBody BookAuthor bookAuthor) {
        return bookAuthorService.bookAuthor(bookAuthor);
    }
}
