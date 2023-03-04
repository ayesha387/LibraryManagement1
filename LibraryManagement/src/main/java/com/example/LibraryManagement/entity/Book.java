package com.example.LibraryManagement.entity;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="book")
public class Book {

@Id
@Column(name = "book_id")
    private Long id;
@Column(name = "reserve_Books")
private String reserveBooks;
@Column(name = "ISBN")
private String ISBN;
@Column(name = "time")
private LocalDateTime time;
@Column(name = "category")
private String category;
@Column(name = "edition")
private String edition;
@Column(name = "price")
private int price;
@Column(name = "return_date")
private LocalDateTime returnDate;
@Column(name = "dueDate")
private LocalDateTime dueDate;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;


}
