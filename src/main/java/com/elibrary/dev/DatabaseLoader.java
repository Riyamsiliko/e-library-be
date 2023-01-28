package com.elibrary.dev;

import com.elibrary.dev.model.Book;
import com.elibrary.dev.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements org.springframework.boot.CommandLineRunner {

    private final BookRepository repository;

@Autowired

    public DatabaseLoader(BookRepository repository) {
        this.repository = repository;
    }

    public void run(String... strings) throws Exception {
    this.repository.save(new Book("Mkuki wa Kabili","Hamadi Makame",
            "fiction", "second","Mtoto anaruddi nyumbani","Kiswahili"));
    this.repository.save(new Book("kilio chetu", "mbahili joshua",
            "simulizi", "third", "inatuunza kua tusilie sna", "kiswahili"));
    }
}
