package com.AndrzejJarosz.core.module.book.repository;

import com.AndrzejJarosz.core.module.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BooksRepository extends JpaRepository<BookEntity, Long>, JpaSpecificationExecutor<BookEntity> {
}