package ro.stportal.studentportal.repository;

import com.fasterxml.jackson.databind.ser.Serializers;

import java.util.List;

public class Book extends BaseEntity {

    private String isbn;
    private List<Author> authors;
    private List<BookDomain> bookDomains;
    private int numberOfBooks;
    private String title;
    private String publisher;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<BookDomain> getBookDomains() {
        return bookDomains;
    }

    public void setBookDomains(List<BookDomain> bookDomains) {
        this.bookDomains = bookDomains;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
