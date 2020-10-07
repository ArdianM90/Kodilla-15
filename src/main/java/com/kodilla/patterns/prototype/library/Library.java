package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.Task;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String setName(String name) {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library deepCopy(String name) throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.setName(name);
        clonedLibrary.books = new HashSet<>();
        for (Book clonedBook : books) {
            System.out.println("Dodaję książkę");
            String title = clonedBook.title;
            String author = clonedBook.author;
            LocalDate date = clonedBook.publicationDate;
            clonedLibrary.getBooks().add(new Book(title, author, date));
        }
        return clonedLibrary;
    }
}