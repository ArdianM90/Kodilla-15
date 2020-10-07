package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library myLibrary = new Library("my Library");
        LocalDate date = LocalDate.of(2000, 05, 15);
        Book bookNo1 = new Book("book no1", "Ardian M", date);
        Book bookNo2 = new Book("book no2", "Ardian M", date);
        Book bookNo3 = new Book("book no3", "Ardian M", date);
        myLibrary.getBooks().add(bookNo1);
        myLibrary.getBooks().add(bookNo2);
        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = myLibrary.deepCopy("cloned  Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        clonedLibrary.getBooks().add(bookNo3);
        //Then
        Assert.assertEquals(2, myLibrary.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
    }
}
