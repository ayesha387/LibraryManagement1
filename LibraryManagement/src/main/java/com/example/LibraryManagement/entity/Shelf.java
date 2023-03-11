package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Shelf")
public class Shelf {
@Id
@Column(name = "shelf_id")
    private Long id;
@Column(name = "name")
    private String name;

    @OneToMany
    @JoinColumn(name="shelf_id")
    private List<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
