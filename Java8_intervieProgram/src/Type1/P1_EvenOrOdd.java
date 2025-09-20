package Type1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P1_EvenOrOdd {
	
	
	public static void main(String[] args) {
		
		
		// find even and Odd from given list
		
		
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
	 
		List<Integer> even=listOfIntegers.stream().filter(x->x%2==0).collect(Collectors.toList());
		List<Integer> odd=listOfIntegers.stream().filter(x->x%2!=0).collect(Collectors.toList());
		
	System.out.println(even);
	System.out.println(odd);
	
	
	// Using partionBy
	
	Map<Boolean,List<Integer>> evenAndOddMap= listOfIntegers
			.stream().collect(Collectors.partitioningBy(x->x%2==0));
	
	System.out.println("Even and Odd List"+evenAndOddMap);
	
	Set<Entry<Boolean, List<Integer>>> entry=evenAndOddMap.entrySet();
	
	for(Entry<Boolean, List<Integer>> key:entry)
	{
		System.out.println("--------------");
		if(key.getKey()) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
		System.out.println("--------------");
		
		List<Integer> list=key.getValue();
		for(int i:list) {
			System.out.println(i);
		}
	}
	
	}

}
