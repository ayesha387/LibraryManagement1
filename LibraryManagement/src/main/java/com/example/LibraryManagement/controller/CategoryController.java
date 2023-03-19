package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.Category;
import com.example.LibraryManagement.model.CategoryModel;
import com.example.LibraryManagement.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/saveCategory")
    public CategoryModel saveCategory(@RequestBody CategoryModel categoryModel) {
        return categoryService.category(categoryModel);
    }
}
