package labtasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Lab Task 3: Programming to an Abstraction.
 * The variable type is always the interface (List<String>), never the
 * concrete class - proving client code depends on the abstraction, not a
 * specific implementation.
 */
public class ListAbstractionDemo {

    // Declares and builds the list as an ArrayList, but the declared
    // type of the variable is the interface, List<String>.
    public List<String> createWithArrayList() {
        List<String> students = new ArrayList<>();
        students.add("Ali");
        return students;
    }

    // Exact same variable type (List<String>), just backed by a
    // LinkedList this time - the rest of the code using this list
    // would not need to change at all.
    public List<String> createWithLinkedList() {
        List<String> students = new LinkedList<>();
        students.add("Ali");
        return students;
    }
}
