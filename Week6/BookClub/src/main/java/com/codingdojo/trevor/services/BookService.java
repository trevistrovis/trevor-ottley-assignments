package com.codingdojo.trevor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.trevor.models.Book;
import com.codingdojo.trevor.repositories.BookRepository;


@Service
public class BookService {
	
	@Autowired
	private BookRepository brepo;
	
	
	public List<Book> allBooks(){
		return brepo.findAll();
	}
	
	public Book createBook(Book book) {
		return brepo.save(book);
	}
	
	public void deleteBook(Long id) {
		brepo.deleteById(id);
	}
	
	public Book getOneBook(Long id) {
		return brepo.findById(id).orElse(null);
	}

}
