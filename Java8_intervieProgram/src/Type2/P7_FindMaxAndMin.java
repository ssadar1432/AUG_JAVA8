package Type2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P7_FindMaxAndMin {
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
		
		int max=listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max = "+max);
		int min=listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Min = "+min);
		
	}

}
