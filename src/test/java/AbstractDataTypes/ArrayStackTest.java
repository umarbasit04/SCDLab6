package AbstractDataTypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayStackTest {

    @Test
    public void testPushThenPop_ReturnsLastPushedItem_LIFO() {
        // Exactly the scenario the task specifies: push(10); push(20); push(30);
        Stack<Integer> stack = new ArrayStack<>(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
    }

    @Test
    public void testPop_RemovesItemsInReverseOrder() {
        Stack<Integer> stack = new ArrayStack<>(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek_DoesNotRemoveItem() {
        Stack<Integer> stack = new ArrayStack<>(5);
        stack.push(42);
        assertEquals(42, stack.peek());
        assertEquals(1, stack.size()); // still there after peek
    }

    // NOTE: this manual's ArrayStack has no bounds checking (no capacity
    // overflow check on push, no empty check on pop) - popping an empty
    // stack throws ArrayIndexOutOfBoundsException rather than a clean
    // "stack is empty" exception. That's a limitation of the simple
    // version given in the manual, not something silently patched here;
    // worth mentioning in the reflection.
}
