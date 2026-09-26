package homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryImplementationTest {

    @Test
    public void testAddBook_ThenSearchBook_FindsIt() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B001", "Clean Code", "Robert Martin"));

        Book found = library.searchBook("B001");
        assertEquals("Clean Code", found.getTitle());
        assertEquals("Robert Martin", found.getAuthor());
    }

    @Test
    public void testSearchBook_NotFound_ReturnsNull() {
        LibrarySystem library = new LibraryImplementation();
        assertNull(library.searchBook("NOPE"));
    }

    @Test
    public void testRemoveBook_NoLongerFound() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B002", "The Pragmatic Programmer", "Hunt & Thomas"));
        library.removeBook("B002");
        assertNull(library.searchBook("B002"));
    }

    @Test
    public void testIssueBook_Succeeds_WhenAvailable() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B003", "Effective Java", "Joshua Bloch"));

        assertTrue(library.issueBook("B003"));
        assertTrue(library.searchBook("B003").isIssued());
    }

    @Test
    public void testIssueBook_Fails_WhenAlreadyIssued() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B004", "Design Patterns", "GoF"));
        library.issueBook("B004");

        assertFalse(library.issueBook("B004")); // already issued
    }

    @Test
    public void testReturnBook_Succeeds_WhenIssued() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B005", "Refactoring", "Martin Fowler"));
        library.issueBook("B005");

        assertTrue(library.returnBook("B005"));
        assertFalse(library.searchBook("B005").isIssued());
    }

    @Test
    public void testReturnBook_Fails_WhenNotIssued() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B006", "The Mythical Man-Month", "Fred Brooks"));

        assertFalse(library.returnBook("B006")); // was never issued
    }
}
