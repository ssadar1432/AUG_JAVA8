package Type2;

import java.util.stream.IntStream;

public class P15_SumOfNaturalNumber {

	public static void main(String[] args) {
		
		
		int sum=IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
		
		Double Avg=IntStream.rangeClosed(1, 100).average().getAsDouble();
		
		System.out.println(Avg);
	}
}
