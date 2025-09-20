package Type3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P2_RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        
        List<String> uniqueList=listOfStrings.stream().distinct().toList();
        System.out.println(uniqueList);
        
        
        List<String> list2=Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
        HashSet set=new HashSet<>(list2);
		
        System.out.println("Unique List With no order preserve"+set);
	}

}
