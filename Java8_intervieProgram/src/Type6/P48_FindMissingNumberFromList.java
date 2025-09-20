package Type6;

import java.util.Arrays;
import java.util.List;

public class P48_FindMissingNumberFromList {
	
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9);
		
		int n=num.size()+1;
		
		//System.out.println(n);
		
		int totalSum=n*(n+1)/2;
		
		//System.out.println(totalSum);
		
		int actualSum=num.stream()
				.mapToInt(Integer::intValue).sum();
		
		//System.out.println(actualSum);
		
		int missingNumber=totalSum-actualSum;
		System.out.println("Missing Number : "+missingNumber);
	}
	

}
