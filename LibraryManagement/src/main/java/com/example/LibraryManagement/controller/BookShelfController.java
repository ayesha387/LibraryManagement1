package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.model.BookShelfModel;
import com.example.LibraryManagement.service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookShelfController {

    @Autowired
    private BookShelfService bookShelfService;

    @PostMapping("/saveBookShelf")
    public BookShelfModel saveShelf(@RequestBody BookShelfModel bookShelfModel) {
        return bookShelfService.bookShelf(bookShelfModel);
    }
}
