package com.example.LibraryManagement.model;

import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BookModel {


    private String ISBN;


    private String category;

    private String edition;

    private int price;

}
