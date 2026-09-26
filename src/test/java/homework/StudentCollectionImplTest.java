package homework;

import labtasks.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StudentCollectionImplTest {

    @Test
    public void testIsEmpty_OnNewCollection() {
        StudentCollection collection = new StudentCollectionImpl();
        assertTrue(collection.isEmpty());
        assertEquals(0, collection.getSize());
    }

    @Test
    public void testAddStudent_IncreasesSize() {
        StudentCollection collection = new StudentCollectionImpl();
        collection.addStudent(new Student(1, "Ayesha", 3.8));
        collection.addStudent(new Student(2, "Bilal", 3.4));

        assertEquals(2, collection.getSize());
        assertFalse(collection.isEmpty());
    }

    @Test
    public void testFindStudent_ReturnsCorrectStudent() {
        StudentCollection collection = new StudentCollectionImpl();
        collection.addStudent(new Student(1, "Ayesha", 3.8));
        collection.addStudent(new Student(2, "Bilal", 3.4));

        Student found = collection.findStudent(2);
        assertEquals("Bilal", found.getName());
    }

    @Test
    public void testFindStudent_NotFound_ReturnsNull() {
        StudentCollection collection = new StudentCollectionImpl();
        collection.addStudent(new Student(1, "Ayesha", 3.8));

        assertNull(collection.findStudent(999));
    }

    @Test
    public void testRemoveStudent_DecreasesSizeAndRemovesRecord() {
        StudentCollection collection = new StudentCollectionImpl();
        collection.addStudent(new Student(1, "Ayesha", 3.8));
        collection.addStudent(new Student(2, "Bilal", 3.4));

        collection.removeStudent(1);

        assertEquals(1, collection.getSize());
        assertNull(collection.findStudent(1));
    }
}
