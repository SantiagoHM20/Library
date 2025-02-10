package edu.eci.cvds.tdd.Library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.eci.cvds.tdd.library.book.Book;


import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book1;
    private Book book2;

    @BeforeEach
    void setUp() {
        book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        book2 = new Book("Java Concurrency in Practice", "Brian Goetz", "978-0321349606");
    }

    @Test
    void shouldGetTittle() {
        String tittle = book1.getTittle();
        assertEquals("Effective Java", tittle);
    }

    @Test
    void shouldGetAuthor() {
        String author = book1.getAuthor();
        assertEquals("Joshua Bloch", author);
    }

    @Test
    void shouldGetIsbn() {
        String isbn = book1.getIsbn();
        assertEquals("978-0134685991", isbn);
    }

    @Test
    void shouldEqualSameIsbn() {
        Book book3 = new Book("Another Book", "Another Author", "978-0134685991");
        boolean isEqual = book1.equals(book3);
        assertTrue(isEqual);
    }

    @Test
    void shouldNotEqualDifferentIsbn() {
        boolean isEqual = book1.equals(book2);
        assertFalse(isEqual);
    }


}
