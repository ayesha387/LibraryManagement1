package com.example.LibraryManagement.model;

import com.example.LibraryManagement.entity.Author;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AuthorModel {

    private String name;

    private String email;

    private String phoneNo;

    private String address;

    public Author disassemble() {
        Author author = new Author();
        author.setName(name);
        author.setEmail(email);
        author.setPhoneNo(phoneNo);
        author.setAddress(address);
        return author;
    }
    public AuthorModel assemble(Author author) {
        AuthorModel authorModel = new AuthorModel();
        authorModel.setName(author.getName());
        authorModel.setEmail(author.getEmail());
        authorModel.setPhoneNo(author.getPhoneNo());
        authorModel.setAddress(author.getAddress());
        return authorModel;
    }
}
