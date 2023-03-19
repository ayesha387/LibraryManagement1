package com.example.LibraryManagement.service;

import com.example.LibraryManagement.model.ShelfModel;
import com.example.LibraryManagement.repository.ShelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShelfService {

    @Autowired
    private ShelfRepo shelfRepo;

    public ShelfModel shelf(ShelfModel shelfModel) {
        return shelfModel.assemble(shelfRepo.save(shelfModel.disassemble()));
    }

}
