package Type1;

import java.util.Arrays;

public class P6_RemoveZeros {

	public static void main(String[] args) {
		int[] input = {1, 0, 3, 0, 5, 4, 0, 9, 0, 6};
		
		int[] rmZero=Arrays.stream(input)
				.filter(x->x!=0).toArray();
		System.out.println(Arrays.toString(rmZero));
		
	}
}
