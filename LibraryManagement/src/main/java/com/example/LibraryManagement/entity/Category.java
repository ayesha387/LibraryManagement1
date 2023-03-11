package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
@Id

    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "book")
    private Book book;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
