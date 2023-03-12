package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAuthorRepo extends JpaRepository<BookAuthor, Long> {
}
