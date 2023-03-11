package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.IssueBook;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueBookRepo extends JpaRepository<IssueBook, Long> {
}
