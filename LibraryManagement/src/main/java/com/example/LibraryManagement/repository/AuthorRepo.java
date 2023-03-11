package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
