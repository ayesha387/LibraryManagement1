package com.example.LibraryManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "IssueBook")
public class IssueBook {
    @Id
    @Column(name = "issueBook_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "member")
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

    //    private Book book;
//
//    private Member member;


}
