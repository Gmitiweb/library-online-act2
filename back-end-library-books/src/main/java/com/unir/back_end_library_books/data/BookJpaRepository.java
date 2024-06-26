package com.unir.back_end_library_books.data;

import com.unir.back_end_library_books.model.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

interface BookJpaRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {

    List<Book> findByIsbn(Long isbn);

    List<Book> findByTitle(String title);

    List<Book> findByYearPublication(Integer yearPublication);
}
