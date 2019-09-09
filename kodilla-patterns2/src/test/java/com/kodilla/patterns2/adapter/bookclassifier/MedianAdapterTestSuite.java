package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
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
        books.add(new Book("Daniel Kahneman", "Thinking, Fast and Slow", 2011, "DKT2011"));
        books.add(new Book("Philip Zimbardo", "The Lucifer Effect", 2007, "PZT2007"));
        books.add(new Book("Jon Duckett", "Learn JavaScript & jQuery", 2014, "JDL"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(2011, median);
    }
}
