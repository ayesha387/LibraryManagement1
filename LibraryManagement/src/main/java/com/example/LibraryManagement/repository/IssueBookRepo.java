package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.IssueBook;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueBookRepo extends JpaRepository<IssueBook, Long> {
}
