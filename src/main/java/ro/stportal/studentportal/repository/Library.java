package ro.stportal.studentportal.repository;

import java.util.List;

public class Library extends BaseEntity {

    private FacultyResponsible facultyResponsible;
    private Email email;
    private PhoneNumber phoneNumber;
    private List<Book> books;

    public FacultyResponsible getFacultyResponsible() {
        return facultyResponsible;
    }

    public void setFacultyResponsible(FacultyResponsible facultyResponsible) {
        this.facultyResponsible = facultyResponsible;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
