package Type4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P25_PalidromString {
	
	public static void main(String[] args) {
		
		String input="SADAR";
		
	
		
		boolean isPalindrome = IntStream.range(0, input.length() / 2)
					
			.allMatch(i -> input.charAt(i) == input.charAt(input.length() - i - 1));
			 
			System.out.println("Is the string a palindrome? " + isPalindrome);
			}
			}


