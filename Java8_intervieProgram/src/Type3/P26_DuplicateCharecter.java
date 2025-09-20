package Type3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P26_DuplicateCharecter {
	
	public static void main(String[] args) {
		
		

        String inputString = "Java Concept Of The Day";
         
        Set<String> uniqueChars = new HashSet();
         
        Set<String> duplicateChars = 
                Arrays.stream(inputString.split(""))
                .map(String::toUpperCase)
                        .filter(ch -> ! uniqueChars.add(ch))
                        .collect(Collectors.toSet());
         
        System.out.println(duplicateChars);
        
		// Type2 
		String input = "programminginjava";
		
		 List<Character> duplicateChar = input.chars()
				 .mapToObj(c->(char)c)
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				 .entrySet()
				 .stream()
				 .filter(e->e.getValue()>1)
				 .map(Map.Entry::getKey)
				 .collect(Collectors.toList());
				 
				 System.out.println(duplicateChar);
				

				 String input2 = "programminginjava";
					
			     Map<Character, Long>  duplicateCharWithCount = input2.chars()
						 .mapToObj(c->(char)c)
						 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
						 .entrySet()
						 .stream()
						 .filter(e->e.getValue()>1)
						 .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
						    
					     System.out.println("Duplicate characters in the string: " + duplicateCharWithCount);
					     
						
			}

	}
