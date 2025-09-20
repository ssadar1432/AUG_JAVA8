package Type7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P52_ReverseArray {
	public static void main(String[] args) {


		  int[] s = {5, 1, 7, 3, 9, 6};
		  
		  int[] reversedArray = IntStream.range(0, s.length)
		 .map(i->s[s.length-1-i])
		 .toArray();
		
		  System.out.println(Arrays.toString(reversedArray));

	}


}
