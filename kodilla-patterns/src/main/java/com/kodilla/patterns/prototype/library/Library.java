package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


    public boolean addBook(Book book) {
        return books.add(book);
    }


    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }


    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : getBooks()) {
            clonedLibrary.addBook(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        }
        return clonedLibrary;
    }
}