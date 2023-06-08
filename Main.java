package HomeWorckNew;

import java.time.LocalDate;
import java.util.TreeSet;

import HomeWorckNew.Comparator.TeacherComparator;
import HomeWorckNew.Object.User;


public class Main {
    public static void main(String[] args) {


        User oneTeacher1 = new User("Ярослав", "Ярославовченко", "Якином", LocalDate.now());
        User twoTeacher2 = new User("Глеб", "Глебович", "Иосифович", LocalDate.now());
        User threeTeacher3 = new User("Екатерина", "Константиновна", "Котова", LocalDate.now());
        User threeTeacher4 = new User("Екат", "Конст", "Кот", LocalDate.now());

        TreeSet<User> treeSet2 = new TreeSet<User>(new TeacherComparator<>());
        treeSet2.add(oneTeacher1);
        treeSet2.add(twoTeacher2);
        treeSet2.add(threeTeacher3);
        treeSet2.add(threeTeacher4);
        System.out.println(treeSet2);
    }
}