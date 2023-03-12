package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelfRepo extends JpaRepository<Shelf, Long> {
}
