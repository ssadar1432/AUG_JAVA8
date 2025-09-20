package Type5;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P17_MostRepeatedCharecter {
	
	public static void main(String[] args) {
		
		String s="Sachin Sadar";
		
		Map<Character, Long> freq=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		Entry<Character,Long> MostReapted= freq.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue()).get();
		
		 System.out.println("Most Frequent Element : "+MostReapted.getKey());
         
	        System.out.println("Count : "+MostReapted.getValue());
	    }
}
