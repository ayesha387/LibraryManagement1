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

@OneToMany
@JoinColumn(name = "book_id")
private Book book;
//    private List<Book> books;


    public Long getShelfId() {
        return shelfId;
    }

    public void setShelfId(Long shelfId) {
        this.shelfId = shelfId;
    }
}
