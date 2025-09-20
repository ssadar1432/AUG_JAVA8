package Type2;

import java.util.Arrays;
import java.util.Comparator;

public class P31_SecondHightFromArray {

	public static void main(String[] args) {
		
		int [] num= {10,12,14,17,78,20,22,70,71};
		
		int largest=Arrays.stream(num)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println("Second Largest Number: "+largest);
		
		//Type2
		int largest2=Arrays.stream(num)
		  .distinct()
		  .sorted()
		  .skip(num.length-2)
		  .findFirst()
		  .getAsInt();
		System.out.println("Second Largest Number: "+largest2);
		  

		
	}
	
}
