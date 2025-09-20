package Type3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P29_DuplicateWord {

	public static void main(String[] args) {
		
		String s = "Java is Platform Independent and Secure and Java is Powerful";
		
        Map<String, Long> MapWord=Arrays.stream(s.split(" "))
        		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		List<String> duplicateWord=MapWord
				.entrySet()
			    .stream()
			    .filter(e->e.getValue()>1)
			    .map(Map.Entry::getKey)
			    .collect(Collectors.toList());
			    System.out.println(duplicateWord);
			    
			    
				
	}
}
