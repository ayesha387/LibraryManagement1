package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.Author;
import com.example.LibraryManagement.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;

    public Author author(Author author) {
        return authorRepo.save(author);
    }
}
