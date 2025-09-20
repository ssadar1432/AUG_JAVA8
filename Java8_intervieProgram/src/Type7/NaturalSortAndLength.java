package Type7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalSortAndLength {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "pinaaple");

        String result = fruits.stream()
                .sorted(Comparator.naturalOrder()) // Sort alphabetically
                .map(s -> s + "-" + s.length())    // Map to "string-length" format
                .collect(Collectors.joining(", ")); // Join with comma and space

        System.out.println(result);
    }
}