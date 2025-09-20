package Type5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P24_FirstNonRepeatedCharecter {

	public static void main(String[] args) {

		String input = "Java Concept Of The Day ";

		Map<Character, Long> freq = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Character firstReapeted = freq.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey)
				.findFirst().get();

		System.out.println(firstReapeted);

		Character firstNonReapeted = freq.entrySet()
				.stream().filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst().get();

		System.out.println(firstNonReapeted);
	}

}
