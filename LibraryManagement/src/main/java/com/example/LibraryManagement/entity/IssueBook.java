package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "IssueBook")
public class IssueBook {
    @Id
    @Column(name = "issueBook_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
//    private Book book;
//
//    private Member member;


}
