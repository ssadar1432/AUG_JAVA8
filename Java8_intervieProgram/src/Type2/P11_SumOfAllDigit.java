package Type2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P11_SumOfAllDigit {
	
	public static void main(String[] args) {
		
		int number=12345;
		int sum=0;
		while(number>0) {
			
			int reminder=number%10;
			sum=reminder+sum;
			number=number/10;
		}
		 System.out.println("Sum of digits: " + sum);

	//Using Java 8

	int number1=12345;
	
	Integer sumOfDigits=Stream.of(String.valueOf(number1).split(""))
			.collect(Collectors.summingInt(Integer::parseInt));
	 
    //Integer sumOfDigits = Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
     
    System.out.println(sumOfDigits);
}
}