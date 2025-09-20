package Type6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P50_RemoveConsecutiveDuplicatesFromList {
	
	public static void main(String[] args) {
		
		//Remove Duplicate
	     List<String> originalList1=Arrays.asList("apple","apple","banana","orange","apple");
	     
	     List<String> unique=originalList1.stream().distinct().toList();
	     
	     System.out.println(unique);
 	    	
        //Remove Consecutive Duplicates From List
	     List<String> originalList=Arrays.asList("apple","apple","banana","orange","apple");
	    	
         List<String> resultList = IntStream.range(0, originalList.size())
         .filter(i->i==0 ||!originalList.get(i).equals(originalList.get(i-1)))
         .mapToObj(originalList::get)
         .collect(Collectors.toList());
         
         
         
         System.out.println("List without consecutive duplicates (using Streams): " + resultList);
         List<Integer> originalList2 = List.of(1, 1, 2, 2, 3, 1, 4, 4, 4, 5);
         List<Integer> result = IntStream.range(0, originalList2.size())
        // List<String> originalList3 = Arrays.asList("a", "a", "b", "b", "b", "c", "a");
        //     List<String> result = IntStream.range(0, originalList2.size())
             .filter(i -> i == 0 || !originalList2.get(i).equals(originalList2.get(i - 1)))
             .mapToObj(originalList2::get)
             .toList();

         System.out.println(result);

	}

}
