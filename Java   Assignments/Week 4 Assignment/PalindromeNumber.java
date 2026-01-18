import java.util.Scanner;

public class PalindromeNumber{
	public static int reverse (int number){

	int numbers = 0;

	while(number != 0){
		int digit = number % 10;
		numbers = numbers * 10 + digit;
		number /= 10;
	}
	return numbers;
	}

	public static boolean isPalindrome (int number){
	    return number == reverse(number);
	}
}

