package exercise28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Mainnnnn {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(10);
        arr.add(11);
        System.out.println(arr.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Comparator.naturalOrder()));
    }
}
