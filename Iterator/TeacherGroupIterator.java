package HomeWorckNew.Iterator;

import java.util.Iterator;
import java.util.List;

import HomeWorckNew.TeacherGroup;
import HomeWorckNew.Object.Teacher;

public class TeacherGroupIterator implements Iterator<Teacher> {


    private int counter;
    private final List<Teacher> teachers;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.teachers = teacherGroup.getTeachers();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {return counter < teachers.size();}

    @Override
    public Teacher next() {
        if (!hasNext()){
            throw new RuntimeException("Students");
        }

        return teachers.get(counter++);
    }
    }
