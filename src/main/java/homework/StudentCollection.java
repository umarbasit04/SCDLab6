package homework;

import labtasks.Student;

/**
 * Homework 2: StudentCollection ADT.
 * Specification only - describes WHAT operations a collection of
 * students supports, independent of how it's stored internally.
 */
public interface StudentCollection {

    /** Adds student to the collection. */
    void addStudent(Student student);

    /** Removes the student with the given id, if present. */
    void removeStudent(int id);

    /**
     * @param id the student id to search for
     * @return the Student with that id, or null if not found
     */
    Student findStudent(int id);

    /** @return the number of students currently in the collection */
    int getSize();

    /** @return true if the collection has no students */
    boolean isEmpty();
}
