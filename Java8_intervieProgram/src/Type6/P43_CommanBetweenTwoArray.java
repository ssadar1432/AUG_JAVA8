package Type6;

import java.util.Arrays;
import java.util.List;

public class P43_CommanBetweenTwoArray {
public static void main(String[] args) {
	
	

	List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
    
    
    List<Integer> commanArray=list1.stream().filter(list2::contains).toList();

   
    System.out.println("Common Elements: " + commanArray);
}
}
