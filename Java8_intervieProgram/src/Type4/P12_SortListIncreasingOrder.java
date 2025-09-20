package Type4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P12_SortListIncreasingOrder {
	
	public static void main(String[] args) {
		
		 List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
	       
		 List<String> sortedList=listOfStrings.stream()
				 .sorted(Comparator.reverseOrder()).toList();
		
		 System.out.println(sortedList);
		 
		 // Based On Length
		 
		 List<String> sortrdBaseLenth=listOfStrings.stream()
				 .sorted(Comparator.comparing(String::length)).toList();
		 System.out.println(sortrdBaseLenth);
	}

}
