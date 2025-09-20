package Type4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P21_ReverseString {

	public static void main(String[] args) {

		String input = "Sachin Sadar Software Enginner";

		String s1 = Arrays.stream(input.split(" ")).sorted(String::compareToIgnoreCase)
				.collect(Collectors.joining(" "));

		System.out.println(s1);

	}
}
