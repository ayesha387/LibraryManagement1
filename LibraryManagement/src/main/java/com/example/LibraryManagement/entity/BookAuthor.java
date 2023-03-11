package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
@Entity
@Table(name = "BookAuthor")
public class BookAuthor {
@Id

@Column(name = "bookAuthor_id")
    private Long id;
//@Column(name = "bookAuthor")
//    private Set<BookAuthor> bookAuthors;
@Column(name = "book_id")
    private Long bookId;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
