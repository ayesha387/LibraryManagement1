package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.model.MemberModel;
import com.example.LibraryManagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/saveMember")
    public MemberModel saveMember (@RequestBody MemberModel memberModel)
    {
        return memberService.member(memberModel);
    }
}
