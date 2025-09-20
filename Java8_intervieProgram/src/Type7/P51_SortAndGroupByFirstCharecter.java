package Type7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P51_SortAndGroupByFirstCharecter {

	public static void main(String[] args) {
		
        // Sample list of strings
        List<String> list = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry", "cranberry");

        
        Map<Character, List<String>> sortedList=list.stream()
        		.sorted() // Sort strings in natural order
                .collect(Collectors.groupingBy(str -> str.charAt(0))); 
        
        System.out.println(sortedList);
     // Print the grouped result
        sortedList.forEach((key, value) -> 
            System.out.println(key + ": " + value));

	}
}
