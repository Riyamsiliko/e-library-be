package com.elibrary.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id @GeneratedValue
    private int id;
    private String bookName;
    private String authorName;
    private String genre;
    private String edition;
    private String bookDescription;
    private String language;

//default constructor
    public Book() {
    }

    public Book(String bookName, String authorName, String genre, String edition, String bookDescription, String language) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.genre = genre;
        this.edition = edition;
        this.bookDescription = bookDescription;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", genre='" + genre + '\'' +
                ", edition='" + edition + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
