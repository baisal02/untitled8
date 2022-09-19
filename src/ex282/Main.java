package ex282;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println("sum: "+list.stream().reduce(0, Integer::sum));
        IntSummaryStatistics a  = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("arifmetic average: "+a.getAverage());
        Set<Integer> items = new HashSet<>();
        System.out.println("recurring numbers: "+list.stream().filter(n -> !items.add(n)).collect(Collectors.toSet()));
    }
}
