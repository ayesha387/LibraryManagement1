package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.BookShelf;
import com.example.LibraryManagement.model.BookShelfModel;
import com.example.LibraryManagement.repository.BookShelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookShelfService {

    @Autowired
    BookShelfRepo bookShelfRepo;

    public BookShelfModel bookShelf(BookShelfModel bookShelfModel) {
        return bookShelfModel.assemble(bookShelfRepo.save(bookShelfModel.disassemble()));
    }
}
