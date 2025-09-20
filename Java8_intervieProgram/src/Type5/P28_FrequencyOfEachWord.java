package Type5;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P28_FrequencyOfEachWord {
	
	public static void main(String[] args) {
		
		
		String s = "Java is Platform Independent and Secure and Java is Powerful";
		
		Map<String ,Long> Freq=Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Freq.forEach((s2,count)->{
			System.out.println("String: = "+s2 +"  "+"Count = " +count);
		});
	}

}
