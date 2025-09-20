package Type1;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class P8_MergeToUnsortedArry {
	
	public static void main(String[] args) {
		
		 int[] a = new int[] {4, 2, 7, 1};
         
	        int[] b = new int[] {8, 3, 9, 5};
	        
	        int [] singleArray=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
	        
	        System.out.println(Arrays.toString(singleArray));
	        
	        //Unsorted Array
	        
	        int[] a1 = new int[] {4, 2, 5, 1};
	         
	        int[] b1 = new int[] {8, 1, 9, 5};
	         
	        int[] c1 = IntStream.concat(Arrays.stream(a1), Arrays.stream(b1)).sorted().distinct().toArray();
	         
	        System.out.println(Arrays.toString(c1));
	        
	}

}

