package edu.eci.cvds.tdd.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import edu.eci.cvds.tdd.library.Library;
import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LibraryTest {

    private Book book1;
    private Library library;

    @BeforeEach
    public void setUp() {

        book1 = new Book("Cien años de soledad", "Gabriel García Marquez", "123");
         library = new Library();
    }

    @Test
    void shouldAddNewBook() {
        
        boolean result = library.addBook(book1);

      
        assertEquals(true, result);
    }

    @Test
     void shouldIncreaseQuantityWhenAddingExistingBook() {
       Book book2 = new Book("Cien años de Soleadad", "Gabriel García Marquez", "1234");
        library.addBook(book1);
        library.addBook(book2);

        String ValueToFind = String.valueOf(book2);

        
        Integer value = library.books.get(ValueToFind);

        assertEquals(2, value);
    }
    
    @Test
     void loanABook() {
        
        Loan loan = library.loanABook("1000095435", "123");

        
        assertNotNull(loan);
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());
    }
}
