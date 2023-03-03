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

}
