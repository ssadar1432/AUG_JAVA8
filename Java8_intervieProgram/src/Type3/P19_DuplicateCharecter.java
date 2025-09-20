package Type3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P19_DuplicateCharecter {
	  public static void main(String[] args) 
	    {
	        String inputString = "Java Concept Of The Day";
	         
	        Set<String> uniqueChars = new HashSet();
	         
	        Set<String> duplicateChars = 
	                Arrays.stream(inputString.split(""))
	                .map(String::toUpperCase)
	                        .filter(ch -> ! uniqueChars.add(ch))
	                        .collect(Collectors.toSet());
	         
	        System.out.println(duplicateChars);
	    }

}
