package com.example.LibraryManagement.service;

import com.example.LibraryManagement.model.IssueBookModel;
import com.example.LibraryManagement.repository.IssueBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueBookService {
    @Autowired
    private IssueBookRepo issueBookRepo;

    public IssueBookModel issueBook (IssueBookModel issueBookModel)
    {
        return issueBookModel.assemble(issueBookRepo.save(issueBookModel.disassemble()));
    }
}
