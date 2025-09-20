package Type3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P36_RemoveDuplicateFromList {
	
	public static void main(String[] args) {
		
		 List<Integer> numList = Arrays.asList(10, 12, 14, 10, 17, 14, 20, 22, 20);
		 
		 List<Integer> removeDuplicateList=numList.stream().distinct().toList();
		 
		 System.out.println(removeDuplicateList);
		 
		 
		 Set<Integer> set=new HashSet<>();
		 
	        Set<Integer> dupliIntegers= numList.stream()
	        		.filter(s1->!set.add(s1)).collect(Collectors.toSet());
	        
	   	 System.out.println(dupliIntegers);
		
	}

}
