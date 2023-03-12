package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.BookShelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookShelfRepo extends JpaRepository<BookShelf, Long> {
}
