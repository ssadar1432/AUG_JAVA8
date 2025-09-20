package Type4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P10_AnagramsOrNot {
	public static void main(String[] args) 
    {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        
        s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(s1);
        
        if(s1.equals(s2)) {
        	System.out.println("two string Are anagrams");
        }else {
        	System.out.println("two string Are Not anagrams");
        }
        
       // AnagramFinder 
        String[] arr = {"eat", "tea", "tan", "ate", "bat", "nat"};
        
        Map<String, List<String>> groupedAnagrams = Arrays.stream(arr)
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);  // sorted word as key
                }));
        System.out.println("Anagram"+groupedAnagrams);
        groupedAnagrams.values().stream()
        .filter(group -> group.size() > 1)
        .forEach(System.out::println);
    }
}
