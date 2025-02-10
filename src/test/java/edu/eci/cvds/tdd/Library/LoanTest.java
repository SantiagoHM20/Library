package edu.eci.cvds.tdd.Library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    private Loan loan;
    private Book book;
    private User user;
    private LocalDateTime loanDate;
    private LoanStatus status;
    private LocalDateTime returnDate;

    @BeforeEach
    public void setUp() {
        book = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        user = new User("John Doe", "john.doe@example.com");
        loanDate = LocalDateTime.now();
        status = LoanStatus.ACTIVE;
        returnDate = loanDate.plusDays(14);

        loan = new Loan();
        loan.setBook(book);
        loan.setUser(user);
        loan.setLoanDate(loanDate);
        loan.setStatus(status);
        loan.setReturnDate(returnDate);
    }

    @Test
    void shouldGetBook() {
        Book result = loan.getBook();
        assertEquals(book, result);
    }

    @Test
    void shouldGetUser() {
        User result = loan.getUser();
        assertEquals(user, result);
    }

    @Test
    void shouldGetLoanDate() {
        LocalDateTime result = loan.getLoanDate();
        assertEquals(loanDate, result);
    }

    @Test
    void shouldGetStatus() {
        LoanStatus result = loan.getStatus();
        assertEquals(status, result);
    }

    @Test
    void shouldGetReturnDate() {
        LocalDateTime result = loan.getReturnDate();
        assertEquals(returnDate, result);
    }

    @Test
    void shouldSetBook() {
        Book newBook = new Book("Java Concurrency in Practice", "Brian Goetz", "978-0321349606");
        loan.setBook(newBook);
        Book result = loan.getBook();
        assertEquals(newBook, result);
    }

    @Test
    void shouldSetUser() {
        User newUser = new User("Jane Doe", "jane.doe@example.com");
        loan.setUser(newUser);
        User result = loan.getUser();
        assertEquals(newUser, result);
    }

    @Test
    void shouldSetLoanDate() {
        LocalDateTime newLoanDate = LocalDateTime.now().plusDays(1);
        loan.setLoanDate(newLoanDate);
        LocalDateTime result = loan.getLoanDate();
        assertEquals(newLoanDate, result);
    }

    @Test
    void shouldSetStatus() {
        LoanStatus newStatus = LoanStatus.RETURNED;
        loan.setStatus(newStatus);
        LoanStatus result = loan.getStatus();
        assertEquals(newStatus, result);
    }

    @Test
    void shouldSetReturnDate() {
        LocalDateTime newReturnDate = returnDate.plusDays(7);
        loan.setReturnDate(newReturnDate);
        LocalDateTime result = loan.getReturnDate();
        assertEquals(newReturnDate, result);
    }
}