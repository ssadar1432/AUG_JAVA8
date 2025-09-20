package Type6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P46_FindLongestStringFromList {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("apple", "banana", "kiwi", "watermelon");

		String longest = strings.stream()
				.max(Comparator.comparingInt(String::length)).get();

		System.out.println(longest);
		
		String longer=strings.stream().max(String::compareTo).get();
		
		System.out.println(longer);
		//Arrays
		
		String[] array = {"apple", "banana", "watermelon", "kiwi"};
		
		  String longestString2 = Arrays.stream(array)
				  //.max((s1, s2)->Integer.compare(s1.length(), s2.length()))
				  .max(String::compareTo)
				  .orElseThrow();
				 System.out.println(longestString2);


	}

}
