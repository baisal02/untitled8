import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> rim = new HashMap<>();
        rim.put("I", 1);
        rim.put("II", 2);
        rim.put("III", 3);
        rim.put("IV", 4);
        rim.put("V", 5);
        rim.put("VI", 6);
        rim.put("VII", 7);
        rim.put("VIII", 8);
        rim.put("IX", 9);
        rim.put("X", 10);
        String[] rimnumbers = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX"
        };



        while (true) {
            System.out.println("type 1 to work with arabic numbers ");
            System.out.println("type 2 to work with Rim numbers ");
            System.out.println("type something else to stop calculator");
            int q = scanner.nextInt();
            if (q == 1) {
                int a = scanner.nextInt();
                scanner.nextLine();
                char x = scanner.nextLine().charAt(0);
                int b = scanner.nextInt();
                switch (x) {
                    case '*' -> System.out.println(a * b);
                    case '+' -> System.out.println(a + b);
                    case '-' -> System.out.println(a - b);
                    case '/' -> System.out.println(a / b);
                    default -> System.out.println("--");
                }
            } else if (q == 2) {
                String a = scanner.nextLine();
                scanner.nextLine();
                char c = scanner.nextLine().charAt(0);
                String b = scanner.nextLine();
                switch (c) {
                    case '+' -> System.out.println(rimnumbers[rim.get(a) + rim.get(b)-1]);
                    case '-' -> System.out.println(rimnumbers[rim.get(a) - rim.get(b)-1]);
                    case '*' -> System.out.println(rimnumbers[rim.get(a) * rim.get(b)-1]);
                    case '/' -> System.out.println(rimnumbers[rim.get(a) / rim.get(b)-1]);
                    default -> System.out.println("---");
                }
            } else {
                break;
            }
        }
    }
}