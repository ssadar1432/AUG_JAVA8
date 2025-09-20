package Type2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P9_FirstThreeHighest {
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		List<Integer> min3=listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).toList();
		System.out.println(min3);
		
		List<Integer> max3=listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println(max3);
	}
	
	 
     

}
