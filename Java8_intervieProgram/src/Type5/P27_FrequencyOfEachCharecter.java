package Type5;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P27_FrequencyOfEachCharecter {
	
	public static void main(String[] args) {
		
		String input="Sachin Sadar";
		
		Map<Character, Long> freq=input.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		freq.forEach((ch,count)->{
			System.out.println("Character = "+ch +"  "+"Count = " +count);
		});
		
	}

}
