package com.example.Book.Store.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Book {


    @Id
    @GeneratedValue
    private int bookID;
    private String bookName;
    private String overview;
    private double rating;
    private String authorName;
    private Date publishDate;
    private int ISBN;

    public Book () {
    }

    public Book (int bookID, String bookName, String overview, double rating, String authorName, Date publishDate, int ISBN) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.overview = overview;
        this.rating = rating;
        this.authorName = authorName;
        this.publishDate = publishDate;
        this.ISBN = ISBN;
    }

    public int getBookID () {
        return bookID;
    }

    public void setBookID (int bookID) {
        this.bookID = bookID;
    }

    public String getBookName () {
        return bookName;
    }

    public void setBookName (String bookName) {
        this.bookName = bookName;
    }

    public String getOverview () {
        return overview;
    }

    public void setOverview (String overview) {
        this.overview = overview;
    }

    public double getRating () {
        return rating;
    }

    public void setRating (double rating) {
        this.rating = rating;
    }

    public String getAuthorName () {
        return authorName;
    }

    public void setAuthorName (String authorName) {
        this.authorName = authorName;
    }

    public Date getPublishDate () {
        return publishDate;
    }

    public void setPublishDate (Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getISBN () {
        return ISBN;
    }

    public void setISBN (int ISBN) {
        this.ISBN = ISBN;
    }
}
