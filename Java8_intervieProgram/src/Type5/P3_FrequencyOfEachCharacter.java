package Type5;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P3_FrequencyOfEachCharacter {
	
	public static void main(String[] args) {
		
		String inputString="Sachin sadar is software Engineer";
		
		
		Map<Character ,Long> freq= inputString.chars()
				                   .mapToObj(c->(char) c)
				                   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(freq);
		
	}

}
