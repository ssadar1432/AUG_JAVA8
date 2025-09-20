package Type3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P18_ExtractDuplicateFromArry {
	
	 public static void main(String[] args) 
	    {
	        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
	        
	        Set<Integer> set=new HashSet<>();
	        
	        Set<Integer> dupliIntegers=listOfIntegers.stream()
	        		.filter(x->!set.add(x)).collect(Collectors.toSet());
	        System.out.println(dupliIntegers);
	        List<Integer> uniqueNbrs=  listOfIntegers.stream().distinct().toList();
	        System.out.println(uniqueNbrs);
	        
	        
	    }
	         

}
