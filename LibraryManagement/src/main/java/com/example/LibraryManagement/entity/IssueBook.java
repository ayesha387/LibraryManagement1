package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "IssueBook")
public class IssueBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issueBook_id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "phoneNo")
    private String phoneNo;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setName(String name) {
    }

    public void setEmail(String email) {
    }

    public void setPhoneNo(String phoneNo) {
    }

    public void setAddress(String address) {
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

    //    private Book book;
//
//    private Member member;



