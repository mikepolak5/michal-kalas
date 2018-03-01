package com.kodilla.patterns2.adapter.bookclasifier.librarya;

import java.util.List;
import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
