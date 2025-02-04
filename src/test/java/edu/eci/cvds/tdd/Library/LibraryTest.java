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
        user1 = new User();
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

        String ValueToFind = String.valueOf(book2);

        
        Integer value = library.books.get(ValueToFind);

        assertEquals(2, value);
    }
    
    @Test
     void shouldLoanABook() {
        
        Loan loan = library.loanABook("1000095435", "123");
        String ValueToFind = String.valueOf(book2);


        Integer value = library.books.get(ValueToFind);

        
       assertNotNull(loan);
       assertEquals(LoanStatus.ACTIVE, loan.getStatus());
       assertEquals(1, value);
    }

    @Test
    void shouldReturnLoan() {

        Loan loan2 = library.loanABook("1000095436", "123");
        library.returnLoan(loan2);
        String ValueToFind = String.valueOf(book2);


        Integer value = library.books.get(ValueToFind);

        //assertEquals(LoanStatus.RETURNED, loan2.getStatus());
        assertEquals(2, value);
        assertNull(loan2);
    }

    @Test
    void shouldAddUser(){

        library.addUser(user1);

        Boolean operation = library.addUser(user1);

        assertEquals(1, operation);

    }
}
