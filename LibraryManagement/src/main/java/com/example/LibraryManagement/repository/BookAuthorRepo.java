package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepo extends JpaRepository<BookAuthor, Long> {
}
