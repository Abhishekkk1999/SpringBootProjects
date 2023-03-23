package com.Book.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 
 private int book_Id;
 @Column(name="book_Name")
 private String book_Name;
 @Column(name="book_Author")
 private String book_Author;
 
 
public int getBook_Id() {
	return book_Id;
}
public void setBook_Id(int book_Id) {
	this.book_Id = book_Id;
}
public String getBook_Name() {
	return book_Name;
}
public void setBook_Name(String book_Name) {
	this.book_Name = book_Name;
}
public String getBook_Author() {
	return book_Author;
}
public void setBook_Author(String book_Author) {
	this.book_Author = book_Author;
}
public Book(int book_Id, String book_Name, String book_Author) {
	super();
	this.book_Id = book_Id;
	this.book_Name = book_Name;
	this.book_Author = book_Author;
}
public Book() {
	super();
}
 
 
 
}
