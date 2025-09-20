package Type6;

import java.util.Arrays;

public class P41_FilterNumberFromArrayStartsWith1 {
	
	public static void main(String[] args) {
		int num1=123;
		
		String s=String.valueOf(num1);
		
		System.out.println(s);
		
		int[] numbers = {10, 22, 14, 15, 37, 18, 19, 100, 101, 120, 200};
		
		
		int [] num=Arrays.stream(numbers)
				.filter(e->String.valueOf(e).startsWith("1")).toArray();
		
		System.out.println(Arrays.toString(num));
	}

}
