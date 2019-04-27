package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My Books");

        Book book1 = new Book("The Lucifer Effect", "Philip Zimbardo", LocalDate.of(2007, 7, 3));
        Book book2 = new Book("The Time Paradox", "Philip Zimbardo", LocalDate.of(2008, 12, 8));
        Book book3 = new Book("Thinking in Java", "Bruce Eckel", LocalDate.of(1998, 2, 3));
        Book book4 = new Book("You Can't Lie to Me", "Janine Driver", LocalDate.of(2012, 4, 29));
        Book book5 = new Book("The Idiot", "Fyodor Dostoyevsky", LocalDate.of(1869, 9, 23));


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("ShallowCopy of the Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("DeepCloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(book5);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
