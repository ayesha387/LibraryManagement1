package com.example.LibraryManagement.model;

import com.example.LibraryManagement.entity.BookShelf;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BookShelfModel {

    public BookShelf disassemble() {
        BookShelf bookShelf = new BookShelf();
        return bookShelf;
    }

    public BookShelfModel assemble(BookShelf bookShelf) {
        BookShelfModel bookShelfModel = new BookShelfModel();
        return bookShelfModel;
    }
}
