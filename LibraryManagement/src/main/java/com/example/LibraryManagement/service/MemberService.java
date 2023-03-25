package com.example.LibraryManagement.service;

import com.example.LibraryManagement.model.MemberModel;
import com.example.LibraryManagement.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MemberService {
    @Autowired
    private MemberRepo memberRepo;

    public MemberModel member (MemberModel memberModel)
    {
        return memberModel.assemble(memberRepo.save(memberModel.disassemble()));
    }
}
