package Type6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P47_FindLargestPossibleNumber {
   
	public static void main(String[] args) {
	
	String[] s = { "10", "4", "7", "8", "9" };
	
	String number = Arrays.stream(s)
			.sorted((a,b)->(b+a).compareTo(a+b))
			.collect(Collectors.joining());
	
	System.out.println(number);
	
	  //987410

}
}
