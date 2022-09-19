package Set;

import java.util.*;

public class Settt {
    public static void main(String[] args) {
      Random random = new Random();
      ArrayList<Student>set= new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            set.add(new Student("students"+i,random.nextInt(18,60), random.nextDouble(5)));
        }
        Company company = new Company();

    }
}
