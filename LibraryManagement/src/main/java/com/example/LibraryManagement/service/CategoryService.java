package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.Category;
import com.example.LibraryManagement.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public Category category (Category category) {
        return categoryRepo.save(category);
    }
}
