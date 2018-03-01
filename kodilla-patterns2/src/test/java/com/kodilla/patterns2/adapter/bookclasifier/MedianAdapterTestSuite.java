package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        books.add(new Book("Andrzej Sapkowski", "Sword of Destiny", 1996, "lol"));
        books.add(new Book("Good author", "Book from 97", 1997, "97"));
        books.add(new Book("Better author", "Book from 98", 1998, "98"));

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(1997, median);
    }
}
