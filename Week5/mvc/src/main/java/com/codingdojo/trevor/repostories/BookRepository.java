package com.codingdojo.trevor.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.trevor.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
