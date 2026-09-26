package homework;

import labtasks.Student;
import java.util.ArrayList;
import java.util.List;

/**
 * Homework 2: Concrete implementation of StudentCollection, backed by an
 * ArrayList<Student>.
 */
public class StudentCollectionImpl implements StudentCollection {

    private final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    @Override
    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
}
