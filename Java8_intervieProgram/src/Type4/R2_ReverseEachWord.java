package Type4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class R2_ReverseEachWord {
	
	public static void main(String[] args) {
		
		String s="I Love You Too";
		String input = "Sachin Sadar Software Enginner";
		
		String reverse=Arrays.stream(input.split(" "))
				 .sorted(String::compareToIgnoreCase)
				 .collect(Collectors.joining(" "));
		
		System.out.println(" Reverse String : "+reverse);
				 
		String revString = Arrays.stream(s.split(" "))
				.sorted(String::compareToIgnoreCase)
				.collect(Collectors.joining(" "));

		System.out.println(revString);
		
		String s1 = Arrays.stream(s.split(" "))
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));

		System.out.println(s1);
		
	}

}
