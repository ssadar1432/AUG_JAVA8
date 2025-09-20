package Type5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P4_FrequencyOfEachElement {

	
	public static void main(String[] args) {
		String[] input={"AA", "BB", "AA", "CC"};
		
		List<String> list=Arrays.asList(input);
		
		Map<String,Long > fre1=list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		System.out.println(fre1);
		
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        
		Map<String,Long> freqElement=stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(freqElement);
		
	}
}
