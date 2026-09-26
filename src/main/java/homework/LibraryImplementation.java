package homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Homework 1: Concrete implementation of LibrarySystem, backed by a
 * HashMap<String, Book> keyed by book ID for fast lookup.
 */
public class LibraryImplementation implements LibrarySystem {

    private final Map<String, Book> catalog = new HashMap<>();

    @Override
    public void addBook(Book book) {
        catalog.put(book.getBookId(), book);
    }

    @Override
    public void removeBook(String bookId) {
        catalog.remove(bookId);
    }

    @Override
    public Book searchBook(String bookId) {
        return catalog.get(bookId);
    }

    @Override
    public boolean issueBook(String bookId) {
        Book book = catalog.get(bookId);
        if (book == null || book.isIssued()) {
            return false;
        }
        book.setIssued(true);
        return true;
    }

    @Override
    public boolean returnBook(String bookId) {
        Book book = catalog.get(bookId);
        if (book == null || !book.isIssued()) {
            return false;
        }
        book.setIssued(false);
        return true;
    }
}
