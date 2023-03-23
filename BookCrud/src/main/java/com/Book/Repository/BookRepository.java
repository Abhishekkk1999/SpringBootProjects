package com.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Book.Model.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {


	

}
