package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
