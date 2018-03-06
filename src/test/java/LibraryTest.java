import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(15);
        book = new Book("Learn Java in 30 days");
    }

    @Test
    public void libraryHasCapacity() {
        int capacity = library.getCapacity();
        assertEquals(15, capacity);
    }

    @Test
    public void countBooksInLibrary() {
        int books = library.countBooks();
        assertEquals(0, books);
    }

    @Test
    public void addBookToLibrary__CapacityNotFull() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void addBookToLibrary__CapacityFull() {
        for (int i = 0; i < 15; i++) {
            library.addBook(book);
        }
        assertEquals(15, library.countBooks());
    }
}
