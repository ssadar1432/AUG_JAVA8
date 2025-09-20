package Type3;

import java.util.Arrays;
import java.util.List;

public class P35_RemoveDuplicateFromArary {
	
	public static void main(String[] args) {
		 int[] numArray = {10, 12, 14, 10, 17, 14, 20, 22, 20};
		 
		int[] duplicate =Arrays.stream(numArray).distinct().toArray();
		
		System.out.println(Arrays.toString(duplicate));
	}

}

