import java.util.Scanner;

public class ReversedNumber{
	public static int reverse (int number){

	int numbers = 0;

	while(number != 0){
		int digit = number % 10;
		numbers = numbers * 10 + digit;
		number /= 10;
		//System.out.print(digit);
	}
	return numbers;
	}
}

