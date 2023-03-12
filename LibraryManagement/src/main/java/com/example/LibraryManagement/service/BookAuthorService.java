package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.BookAuthor;
import com.example.LibraryManagement.repository.BookAuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookAuthorService {
    @Autowired
    private BookAuthorRepo bookAuthorRepo;

    public BookAuthor bookAuthor(BookAuthor bookAuthor) {
        return bookAuthorRepo.save(bookAuthor);
    }
}
