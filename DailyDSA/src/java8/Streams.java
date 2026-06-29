package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        String string = "geeksforgeeks";
        List<Double> decimalList = Arrays.asList(12.45,9.81,45.9,12.7,89.90,34.56,11.3);
        //How do you find frequency of each character in a string using Java 8 streams ?
        Map<Character, Long> collect = string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        System.out.println(collect);

        //How do you sort the given list in the reverse order?
        List<Double> list = decimalList.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(list);

        //How do you find the last element from a list?
        Double v = decimalList.stream().reduce((x, y) -> y).get();
//        System.out.println(v);

        //DT.29/06
//        Given the list of integers, find the first element of the list using Stream functions?
        Double v1 = decimalList.stream().findFirst().get();
//        System.out.println(v1);

//        Given a list of integers, find the total number of elements present in the list using Stream functions?
        long count = decimalList.stream().count();
//        System.out.println(count);

//        Given a list of integers, find the maximum value element present in it using Stream functions?
        Double v2 = decimalList.stream().max(Comparator.naturalOrder()).get();
//        System.out.println(v2);

//        Given a String, find the first non-repeated character in it using Stream functions?
        Character ch = string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x->x,() -> new LinkedHashMap<>(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() == 1).findFirst().map(x -> x.getKey()).get();
        System.out.println(ch);

    }
}
