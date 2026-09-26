package labtasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testGetters_ReturnConstructorValues() {
        Student s = new Student(101, "Ayesha", 3.75);
        assertEquals(101, s.getId());
        assertEquals("Ayesha", s.getName());
        assertEquals(3.75, s.getCgpa(), 0.001);
    }

    // ---------------------------------------------------------------
    // ENCAPSULATION DEMONSTRATION (Lab Task 2's actual test idea):
    // "Attempt to access the variables directly ... to observe the
    // compilation error." Uncomment the three lines below temporarily,
    // try to Clean and Build the project, and NetBeans/javac will refuse
    // to compile with an error like:
    //   "id has private access in labtasks.Student"
    // Take a screenshot of that error for your report, then RE-COMMENT
    // these lines before committing, or the whole project will fail to
    // build for everyone (including this test class).
    //
    // @Test
    //public void thisWillNotCompile_ProvesEncapsulation() {
    //Student s = new Student(101, "Ayesha", 3.75);
    //s.id = 999;      // COMPILE ERROR: id has private access
    //s.name = "Hack"; // COMPILE ERROR: name has private access
    //  s.cgpa = 4.0;    // COMPILE ERROR: cgpa has private access
    //}
    // ---------------------------------------------------------------
}
