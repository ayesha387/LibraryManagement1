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

}
