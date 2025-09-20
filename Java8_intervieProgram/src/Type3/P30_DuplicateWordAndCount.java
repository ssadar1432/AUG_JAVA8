package Type3;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P30_DuplicateWordAndCount {

	public static void main(String[] args) {
		String s = "Java is Platform Independent and Secure and Java is Powerful and robust ";
		
		Map<String,Long> freq=Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
	Map<String,Long>	DuplicateAndCount=freq.entrySet()
				.stream()
				.filter(e->e.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	  System.out.println("Duplicate characters in the string: " + DuplicateAndCount);
	     
		
	}
}
