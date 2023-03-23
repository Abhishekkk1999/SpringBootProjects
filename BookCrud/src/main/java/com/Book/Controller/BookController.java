package com.Book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Book.Model.Book;
import com.Book.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;

	@PostMapping("/add")
	public Book addingBooks(@RequestBody Book book) {
		return bs.addBook(book);
	}
	@GetMapping("/book/author")
	public List <Book> findAllBooks(){
		return bs.getBooks();
		
	}
	
	
	
}
