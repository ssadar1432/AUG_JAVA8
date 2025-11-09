package Type2;

import java.util.Arrays;
import java.util.Comparator;

public class P33_MaxNumberFromArray {
	
	public static void main(String[] args) {
		
	
	  int[] numArray = {10, 12, 14, 17, 78, 20, 22, 70};
	  
	  int max=Arrays.stream(numArray)
			  .boxed()
			  .max(Integer::compareTo)
			  .get();
	  
	  System.out.println("Max Number : "+max);
	  
	  int max2=Arrays.stream(numArray).boxed()
			  .max(Comparator.naturalOrder()).get();
	
	  System.out.println("Max Number : "+max2);
	}
}
