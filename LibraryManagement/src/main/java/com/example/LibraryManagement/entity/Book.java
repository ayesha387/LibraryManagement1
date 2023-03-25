package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "book_id")
    private Long id;

@Column(name = "ISBN")
private String ISBN;

@Column(name = "category")
private String category;
@Column(name = "edition")
private String edition;
@Column(name = "price")
private int price;

    @ManyToOne
    @JoinColumn(name = "bookshelf_id")
    private BookShelf bookShelf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public Shelf getShelf() {
//        return shelf;
//    }

//    public void setShelf(Shelf shelf) {
//        this.shelf = shelf;
//    }
}
