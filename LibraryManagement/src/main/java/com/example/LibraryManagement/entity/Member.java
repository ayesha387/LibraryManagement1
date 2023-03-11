package com.example.LibraryManagement.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
@Entity
@Table(name = "member")
public class Member {
@Id
@Column(name = "member_id")
    private Long id;
@Column(name = "name_id")
 private String name;
@Column(name = "phone_No")
    private String phoneNo;
@Column(name = "email_id")
    private String email;
@Column(name = "address")
    private String address;
//@Column(name = "book")
//    private Set<Book> book;
@Column(name = "join_Date")
    private LocalDateTime joinDate;
@ManyToOne
@JoinColumn(name = "IssueBook")
    private IssueBook issueBook;

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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    public IssueBook getIssueBook() {
        return issueBook;
    }

    public void setIssueBook(IssueBook issueBook) {
        this.issueBook = issueBook;
    }
}
