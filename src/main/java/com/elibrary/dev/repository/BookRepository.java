package com.elibrary.dev.repository;

import com.elibrary.dev.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
