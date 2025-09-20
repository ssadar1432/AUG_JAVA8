package Type2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class P13_SumANdAverag {
	
	public static void main(String[] args) {
		
		 int[] a = {45, 12, 56, 15, 24, 75, 31, 89};
	
		 IntSummaryStatistics stat=Arrays.stream(a).summaryStatistics();
		 
		System.out.println("Count = " +stat.getCount() ); 
		System.out.println("Sum = " +stat.getSum() ); 
		System.out.println("Max = " +stat.getMax() ); 
		System.out.println("Min = " +stat.getMin() ); 
		System.out.println("Average = " +stat.getAverage() ); 
				 
	}

}
