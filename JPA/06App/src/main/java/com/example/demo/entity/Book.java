package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer bookId;
	String bookname;
	String bookAuthor;
	String bookCost;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookCost() {
		return bookCost;
	}

	public void setBookCost(String bookCost) {
		this.bookCost = bookCost;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookname=" + bookname + ", bookAuthor=" + bookAuthor + ", bookCost="
				+ bookCost + "]";
	}

}
