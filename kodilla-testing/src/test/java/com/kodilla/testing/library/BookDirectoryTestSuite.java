package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfNoBooksRented() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Piotrek", "Strzalka", "1232123123");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> bookList1 = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(bookList1);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //When
        List<Book> bookListTest = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, bookListTest.size());
    }
    @Test
    public void testListBooksInHandsOfOneBookRented() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Piotrek", "Strzalka", "1232123123");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> bookList1 = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(bookList1);
        BookLibrary bookLibrary1 = new BookLibrary(libraryDatabaseMock);
        Book book = new Book("dsada", "dsads", 123);
        List<Book> bookListTest;
        bookList1.add(book);

        //When

        bookListTest = bookLibrary1.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, bookListTest.size());
        assertEquals("dsada", bookListTest.get(0).title);
        assertEquals("dsads", bookListTest.get(0).author);
    }
    @Test
    public void testListBooksInHandsOfFiveBooksRented() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Piotrek", "Strzalka", "1232123123");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> bookList1 = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(bookList1);
        BookLibrary bookLibrary5 = new BookLibrary(libraryDatabaseMock);
        Book book = new Book("dsada", "dsads", 123);
        List<Book> bookListTest;
        bookList1.add(book);
        bookList1.add(book);
        bookList1.add(book);
        bookList1.add(book);
        bookList1.add(book);

        //When
        bookListTest = bookLibrary5.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals("dsada", bookListTest.get(0).title);
        assertEquals("dsads", bookListTest.get(0).author);
        assertEquals(5, bookListTest.size());
    }
}