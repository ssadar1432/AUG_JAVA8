package Type1;

import java.util.Arrays;

public class R1_FindProductOfIntgerArray {
	
	public static void main(String[] args) {
		Integer [] array= {10,2,3};
	    int product = Arrays.stream(array)
	    .mapToInt(Integer::intValue)
	    .reduce(1,(a,b)->b*a);
	    System.out.println(product);

	}

}
