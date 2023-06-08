package HomeWorckNew;


import java.util.List;

import HomeWorckNew.Iterator.TeacherGroupIterator;
import HomeWorckNew.Object.Student;
import HomeWorckNew.Object.Teacher;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;

    private Student student;

    public TeacherGroup(List<Teacher> teachers, Student student2){
        this.teachers = teachers;
        this.student = student2;
    }

public List<Teacher> getTeachers(){return teachers;}
    public void setTeachers(List<Teacher> teachers){this.teachers = teachers;}


public Student getStudent(){return student;}
  public void setStudent(Student student) {this.student = student;}



    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + teachers +
                ", student=" + student +
                '}';
    }

    @Override
    public TeacherGroupIterator iterator(){return new TeacherGroupIterator(this);}
}
