package Type4;

import java.util.Arrays;
import java.util.Comparator;

public class P23_FindLongestString {
	public static void main(String[] args) {
		
		String [] names= {"Aditya","Sachin","Arav","Manoj"};
		
	
		String longestString = Arrays.stream(names)
				.max(Comparator.comparingInt(String::length))
				.get();
				
				System.out.println(longestString);	

		
		String smallestString = Arrays.stream(names)
				.min(Comparator.comparingInt(String::length))
				.get();
				
				System.out.println(smallestString);	

	}

	
}
