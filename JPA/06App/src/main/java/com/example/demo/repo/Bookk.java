package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Book;

public interface Bookk extends JpaRepository<Book, Integer> {

	List<Book> findByBookAuthor(String bookAuthor);

//	@Query("SELECT b FROM Book b WHERE b.bookId=:id")
//	Optional<Book> fetchBookById(Integer id);
	
	@Query("SELECT b FROM Book b WHERE b.bookId in (?1)")
	Optional<Book> fetchBookById(Integer id);
	
	
	@Query("SELECT b FROM Book b WHERE b.bookId in (?1,?2)")
	List<Book> fetchBookByIds(Integer id,Integer id2);
	
	
	
	
	@Query("SELECT b FROM Book b WHERE b.bookId IN (:id)")
	List<Book> fetchBookbyIdd(List<Integer> id);

}
