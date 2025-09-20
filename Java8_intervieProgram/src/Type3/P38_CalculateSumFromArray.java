package Type3;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class P38_CalculateSumFromArray {
	public static void main(String[] args) {
		// Array of Integer
	      Integer [] num= {10, 20, 30, 40, 50};

	      
	      int sum=Arrays.stream(num)
	    		  .mapToInt(Integer::intValue).sum();
	      
	      System.out.println("sum : "+sum);
	      
	       // Array of int 
	       
	       
	       int [] numbers= {10, 20, 30, 40, 50};
	       
	       int sum2 = Arrays.stream(numbers)
	       .sum();
	       
	       System.out.println("Sum: "+sum2);

	       int[] a = {45, 12, 56, 15, 24, 75, 31, 89};
	   	
			 IntSummaryStatistics stat=Arrays.stream(a).summaryStatistics();
			 
			System.out.println("Count = " +stat.getCount() ); 
			System.out.println("Sum = " +stat.getSum() ); 
			System.out.println("Max = " +stat.getMax() ); 
			System.out.println("Min = " +stat.getMin() ); 
			System.out.println("Average = " +stat.getAverage() ); 
					 
	}

}
