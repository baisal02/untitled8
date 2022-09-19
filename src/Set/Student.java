package Set;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double gpa;

    @Override
    public String toString() {
        return
                "name=" + name + '\n' +
                        "age=" + age + '\n' +
                        "gpa=" + gpa + '\n'
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return o.age - this.age;
    }

    public static Comparator<Student> sortbyGpa = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return (int) (o2.gpa - o1.gpa);
        }
    };

}
