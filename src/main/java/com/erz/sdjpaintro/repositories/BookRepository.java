package com.erz.sdjpaintro.repositories;

import com.erz.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
