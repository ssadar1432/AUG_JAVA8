package Type2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P34_MaxNumberFromList {
	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(10, 12, 14, 17, 78, 20, 22, 70);

		int max = numList.stream().max(Comparator.naturalOrder()).get();

		System.out.println("Max Number : " + max);
		
		int max2=numList.stream().max(Integer::compareTo).get();
		System.out.println("Max Number : " + max2);

		
		//minimum
		int min = numList.stream().min(Comparator.naturalOrder()).get();

		System.out.println("Min Number : " + min);
		
		int min2=numList.stream().min(Integer::compareTo).get();
		System.out.println("Min Number : " + min2);
	}

}
