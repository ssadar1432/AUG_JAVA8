package Type4;

import java.util.stream.IntStream;

public class P22_Factorial {
	public static void main(String[] args) {

		int number = 5;

		int fact = IntStream.rangeClosed(1, number)
				.reduce(1, (x, y) -> x * y);

		System.out.println(fact);

	}

}
