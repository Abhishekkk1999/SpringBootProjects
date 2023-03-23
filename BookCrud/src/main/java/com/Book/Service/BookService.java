package com.Book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.Book.Model.Book;
import com.Book.Repository.BookRepository;

@Service

public class BookService {
	@Autowired
	static
	 BookRepository bookRepository;
	
	
	public static List<Book> getBooks(){
		return bookRepository.findAll();
	}
	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
		
}
