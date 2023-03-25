package com.example.LibraryManagement.model;

import com.example.LibraryManagement.entity.Author;
import com.example.LibraryManagement.entity.IssueBook;
import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class IssueBookModel {


    private String name;

    private String phoneNo;

    private String email;

    private String address;

    public IssueBook disassemble() {
        IssueBook issueBook = new IssueBook();
        issueBook.setName(name);
        issueBook.setPhoneNo(phoneNo);
        issueBook.setEmail(email);
        issueBook.setAddress(address);
        return issueBook;
    }

    public IssueBookModel assemble(IssueBook issueBook) {
        IssueBookModel issueBookModel = new IssueBookModel();
        issueBookModel.setName(issueBook.getName());
        issueBookModel.setPhoneNo(issueBook.getPhoneNo());
        issueBookModel.setEmail(issueBook.getEmail());
        issueBookModel.setAddress(issueBook.getAddress());
        return issueBookModel;
    }
}
