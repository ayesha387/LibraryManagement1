package com.example.LibraryManagement.model;

import com.example.LibraryManagement.entity.Author;
import com.example.LibraryManagement.entity.Book;
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

    public Book disassemble() {
        Book book = new Book();
        book.setISBN(ISBN);
        book.setCategory(category);
        book.setEdition(edition);
        book.setPrice(price);
        return book;
    }
    public BookModel assemble(Book book) {
        BookModel bookModel = new BookModel();
        bookModel.setISBN(book.getISBN());
        bookModel.setCategory(book.getCategory());
        bookModel.setEdition(book.getEdition());
        bookModel.setPrice(book.getPrice());
        return bookModel;
    }
}
