package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
//        System.out.println(ch);





//        Find the First Repeated Character in a String
        Character c1 = string.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).findFirst().get();
//        System.out.println(c1);

//        Check if a String is a Palindrome
        String str = "abcba";
        boolean isPalindrome = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));
        //OR
        String reversedString = new StringBuilder( str.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining())).reverse().toString();
        boolean equals = str.equals(reversedString);
//        System.out.println(equals);

//        Check if Any String Matches a Condition
//        Question: Check if any string in a list contains “API”.
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean api = strings.stream().anyMatch(x -> x.contains("API"));
//        System.out.println(api);

//        10. Group Strings by Length
//        Question: Group a list of strings based on their length.
        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer, List<String>> collect1 = words.stream().collect(Collectors.groupingBy(x->x.length()));
//        System.out.println(collect1);


//        20. Partition Numbers into Even and Odd
//        Question: Partition a list of numbers into even and odd.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> collect2 = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect2);

//        21. Find Nth Largest Element in a List
//        Question: Find the 3rd largest element in a list.
        List<Integer> numbers1 = Arrays.asList(10, 20, 50, 40, 30);
        Stream<Integer> skip = numbers1.stream().sorted().skip(2);
    }
}
