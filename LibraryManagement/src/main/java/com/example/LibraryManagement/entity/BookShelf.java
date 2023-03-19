package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "BookShelf")
public class BookShelf {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "bookshelf_id")
    private Long shelfId;

//    private List<Book> book;


    public Long getShelfId() {
        return shelfId;
    }

    public void setShelfId(Long shelfId) {
        this.shelfId = shelfId;
    }
}
