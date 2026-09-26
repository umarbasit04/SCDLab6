package homework;

/**
 * Homework 1: Library System ADT.
 * Defines WHAT a library system does, not HOW it does it - no collection
 * type or storage detail appears anywhere in this contract.
 */
public interface LibrarySystem {

    /** Adds a new book to the library's catalog. */
    void addBook(Book book);

    /** Removes the book with the given ID from the catalog, if present. */
    void removeBook(String bookId);

    /**
     * @param bookId the ID to search for
     * @return the Book with that ID, or null if no such book exists
     */
    Book searchBook(String bookId);

    /**
     * Marks the book with the given ID as issued (checked out).
     * @return true if the book existed and was not already issued;
     *         false otherwise (not found, or already issued)
     */
    boolean issueBook(String bookId);

    /**
     * Marks the book with the given ID as returned (available again).
     * @return true if the book existed and was issued; false otherwise
     */
    boolean returnBook(String bookId);
}
