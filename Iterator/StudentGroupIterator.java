package HomeWorckNew.Iterator;

import java.util.Iterator;
import java.util.List;

import HomeWorckNew.StudentGroup;
import HomeWorckNew.Object.Student;

public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()){
            throw new RuntimeException("Students");
        }

        return students.get(counter++);
    }
}