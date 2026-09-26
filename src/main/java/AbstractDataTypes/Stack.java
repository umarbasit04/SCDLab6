package AbstractDataTypes;

// Defining a Stack ADT
public interface Stack<T> {
    void push(T item);   // Adds an element to the top
    T pop();              // Removes and returns the top element
    T peek();              // Returns the top element
    boolean isEmpty();    // Checks whether stack is empty
    int size();           // Returns number of elements
}
