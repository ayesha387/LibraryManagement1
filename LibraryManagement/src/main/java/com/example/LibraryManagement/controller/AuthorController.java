package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.Author;
import com.example.LibraryManagement.model.AuthorModel;
import com.example.LibraryManagement.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
  @Autowired
    private AuthorService authorService;

  @PostMapping("/saveAuthor")
    public AuthorModel saveAuthor(@RequestBody AuthorModel authorModel) {
      return authorService.author(authorModel);
  }
}
