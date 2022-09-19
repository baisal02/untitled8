package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Company implements CompanyInterface {
     ArrayList<Student> students = new ArrayList<>();

    @Override
    public String toString() {
        return "Company{" +
                "students=" + students +
                '}';
    }

    @Override
    public void addStudents(Student s) {
        students.add(s);
    }

    @Override
    public void printEmployees() {
        System.out.println(students);
    }

    @Override
    public void gpaTop5() {
        students.sort(Student.sortbyGpa);
        for (int i = 0; i < 5; i++) {
            System.out.println(students.get(i));
        }
    }
}
