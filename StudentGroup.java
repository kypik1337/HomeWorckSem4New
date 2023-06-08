package HomeWorckNew;

import java.util.List;

import HomeWorckNew.Iterator.StudentGroupIterator;
import HomeWorckNew.Object.Student;
import HomeWorckNew.Object.Teacher;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(List<Student> students, Teacher teacher2) {
        this.students = students;
        this.teacher = teacher2;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
