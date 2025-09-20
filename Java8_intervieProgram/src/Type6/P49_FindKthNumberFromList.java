package Type6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P49_FindKthNumberFromList {
	
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 4, 6, 7, 8, 9);
		int k=2;
		if (k > 0 && k <= num.size()) {
		Integer largest=num.stream()
				.sorted(Comparator.reverseOrder())
				.skip(k-1)
				.findFirst()
				.get();
		
		System.out.println(k+" Largest Number From List: "+largest);
		}else {
			System.out.println("Invalid value for k: " + k);
		}
		
	}
	

}
