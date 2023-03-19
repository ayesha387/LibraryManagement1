package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.Shelf;
import com.example.LibraryManagement.model.ShelfModel;
import com.example.LibraryManagement.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShelfController {

    @Autowired
    ShelfService shelfService;

    @PostMapping("/saveShelf")
    public ShelfModel saveShelf(@RequestBody ShelfModel shelfModel) {
        return shelfService.shelf(shelfModel);
    }

}
