package Type5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P40_FirstNonRepeatedCharecter {
public static void main(String[] args) {
	String input = "Java is a programming language and Java is widely used language";
	
	Map<Character,Long> freq=input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()));
	
    Character ch=freq.entrySet()
    		.stream().filter(e->e.getValue()==1)
    		.map(Map.Entry::getKey).findFirst().get();
    
    System.out.println(ch);
}
}
