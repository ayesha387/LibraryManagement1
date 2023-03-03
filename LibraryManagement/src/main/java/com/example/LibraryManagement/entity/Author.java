package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Author")
public class Author {
@Id
@Column(name = "author_id")
    private Long id;
@Column(name = "name")
    private String name;
    @Column(name = "email_id")
    private String email;
    @Column(name = "phone_No")
    private String phoneNo;
    @Column(name = "address")
    private String address;

}
