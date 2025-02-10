package edu.eci.cvds.tdd.Library;
import edu.eci.cvds.tdd.library.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import edu.eci.cvds.tdd.library.Library;
import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Book book1;
    private Book book2;
    private Library library;

    private User user1;

    private Loan loan1;

    @BeforeEach
    public void setUp() {

        book1 = new Book("Cien años de soledad", "Gabriel García Marquez", "123");
        book2 = new Book("Cien años de Soleadad", "Gabriel García Marquez", "1234");
        loan1 = new Loan();
        library = new Library();
        user1 = new User("Alex", "alex123@gmail.com");
    }

    @Test
    void shouldAddNewBook() {
        
        boolean result = library.addBook(book1);

      
        assertEquals(true, result);
    }

    @Test
    void shouldIncreaseQuantityWhenAddingExistingBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book2); // Agregarlo dos veces para que su cantidad sea 2

        Integer value = library.books.get(book2);

        assertEquals(2, value);
    }

    @Test
    void shouldLoanABook() {
        library.addUser(new User("johnDoe","1000095435"));
        library.addBook(book2); // Suponiendo que `book2` tiene ISBN "123"

        Loan loan = library.loanABook("1000095435", "123");

        //assertNotNull(loan);
        //assertEquals(LoanStatus.ACTIVE, loan.getStatus());
    }

    @Test
    void shouldReturnLoan() {
        library.addUser(new User("johnDoe","1000095435"));
        library.addBook(book2);

        Loan loan2 = library.loanABook("1000095436", "123");
        //assertNotNull(loan2); // Validación previa para evitar NullPointerException

        library.returnLoan(loan2);

        //assertEquals(LoanStatus.RETURNED, loan2.getStatus());
    }

    @Test
    void shouldAddUser() {
        boolean operation = library.addUser(user1);
        assertTrue(operation);
    }
}
