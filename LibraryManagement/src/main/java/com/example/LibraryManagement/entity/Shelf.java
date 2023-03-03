package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Shelf")
public class Shelf {
@Id
@Column(name = "shelf_id")
    private Long id;
@Column(name = "name")
    private String name;

}
