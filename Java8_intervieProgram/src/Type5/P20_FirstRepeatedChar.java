package Type5;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P20_FirstRepeatedChar {

	public static void main(String[] args) {
		
		
		String input="Java Concept Of The Day ";
		
		  // First Non  Repeatetive
		Map<Character,Long> freq=input.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
		  System.out.println("Frequency = "+  freq);
		  Character firstNon=freq.entrySet().stream()
				  .filter(e->e.getValue()==1)
				  .map(ent->ent.getKey())
				  .findFirst().get();
		  System.out.println("First non Reapeted = "+  firstNon);
		  // First  Repeatetive
		  
		  Map<String,Long> fnrC=Arrays.stream(input.split(""))
				  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
			
	  String firstRepeated=fnrC.entrySet().stream()
			  .filter(e->e.getValue()>1)
			  .map(ent->ent.getKey())
			  .findFirst().get();
	  System.out.println("First  Reapeted = "+  firstRepeated);
	
	  
	
	}
}
