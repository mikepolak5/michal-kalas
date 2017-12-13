package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Harry Potter", "J.K Rowling", LocalDate.of(1996, 3, 21));
        Book book2 = new Book("Game of Thrones", "George R.R Martin", LocalDate.of(1997, 2, 11));
        Book book3 = new Book("Sword of Destiny", "Andrzej Sapkowski", LocalDate.of(1998, 6, 12));

        Library library = new Library("My library");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());

    }
}
