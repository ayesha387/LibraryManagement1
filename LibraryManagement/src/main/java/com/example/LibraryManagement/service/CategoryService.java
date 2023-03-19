package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.Category;
import com.example.LibraryManagement.model.CategoryModel;
import com.example.LibraryManagement.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public CategoryModel category (CategoryModel categoryModel) {
        return categoryModel.assemble(categoryRepo.save(categoryModel.disassemble()));
    }
}
