package Type6;

import java.util.Arrays;
import java.util.List;

public class P42_FilterNumberFromListStartsWith1 {
	
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(20, 12, 24, 15, 17, 28, 19, 100, 101, 120, 200);
		 
		 
		 List<Integer> startWith=numbers.stream()
				 .filter(e->String.valueOf(e).startsWith("1")).toList();
		

	System.out.println(startWith);
	}

}
