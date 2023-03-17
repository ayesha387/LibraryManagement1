package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.Author;
import com.example.LibraryManagement.model.AuthorModel;
import com.example.LibraryManagement.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;
    public AuthorModel author(AuthorModel authorModel) {
        return authorModel.assemble(authorRepo.save(authorModel.disassemble()));
    }
}
