package Type6;

import java.util.Arrays;
import java.util.List;

public class P45_ListToSquareList {
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(5,6,7,8,9);
		
		List<Integer> Square=numList.stream().map(e->e*e).toList();
		
		System.out.println(Square);
		
	}

}
