package Type2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P32_SecondLargestNumberFromList {
	
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(10,12,14,15,17,18,9,7,8,6,5,8,10);
		
		Integer largest=num.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println("Second Largest Number From List: "+largest);
	}

}
