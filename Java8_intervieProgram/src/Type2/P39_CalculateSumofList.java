package Type2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class P39_CalculateSumofList {
	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 50);
		
		IntSummaryStatistics stat=numberList.stream()
				.mapToInt(Integer::intValue).summaryStatistics();
		
		System.out.println("Count = " +stat.getCount() ); 
		System.out.println("Sum = " +stat.getSum() ); 
		System.out.println("Max = " +stat.getMax() ); 
		System.out.println("Min = " +stat.getMin() ); 
		System.out.println("Average = " +stat.getAverage() );
	}

}
