package com.codingdojo.trevor.services;

import org.springframework.stereotype.Service;

import com.codingdojo.trevor.repostories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
	}

}
