package com.example.LibraryManagement.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Author")
public class Author {
@Id
@GeneratedValue
@Column(name = "author_id")
    private Long authorId;
@Column(name = "name")
    private String name;
    @Column(name = "email_id")
    private String email;
    @Column(name = "phone_No")
    private String phoneNo;
    @Column(name = "address")
    private String address;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
