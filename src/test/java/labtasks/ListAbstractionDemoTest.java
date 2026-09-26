package labtasks;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListAbstractionDemoTest {

    private final ListAbstractionDemo demo = new ListAbstractionDemo();

    @Test
    public void testCreateWithArrayList_ContainsAli() {
        List<String> students = demo.createWithArrayList();
        assertTrue(students.contains("Ali"));
        assertTrue(students instanceof ArrayList);
    }

    @Test
    public void testCreateWithLinkedList_ContainsAli() {
        List<String> students = demo.createWithLinkedList();
        assertTrue(students.contains("Ali"));
        assertTrue(students instanceof LinkedList);
    }

    @Test
    public void testBothImplementations_BehaveIdenticallyThroughTheInterface() {
        // Same test logic works unchanged regardless of the concrete type -
        // this IS the proof that client code depends only on List<String>.
        List<String> arrayBacked = demo.createWithArrayList();
        List<String> linkedBacked = demo.createWithLinkedList();

        assertEquals(1, arrayBacked.size());
        assertEquals(1, linkedBacked.size());
        assertEquals(arrayBacked.get(0), linkedBacked.get(0));
    }
}
