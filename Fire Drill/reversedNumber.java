//Write a program takes in a number and inverses the integer

import java.util.Scanner;

public class reversedNumber{
	public static void main (String [] args){

	Scanner userInput = new Scanner (System.in);
	int threeDigits = userInput.nextInt();
	String name = userInput.next()
	int numbers = 0;

	//int first = (threeDigits / 100) ;
	//int second = (threeDigits / 10) % 10 ;
	//int third = (threeDigits % 10);

	while(threeDigits != 0){
		int digit = threeDigits % 10;
		//numbers = numbers * 10 + digit;
		threeDigits /= 10;
		System.out.print(digit);
	}
	System.out.println();

	//for (threeDigits ; threeDigits != 0; number /= 10){
		//int digit = threeDigits % 10;
		//System.out.print(digit);
		//System.out.println("Index"+number);
		
		//}

	//System.out.printf("The reverse is %d%d%d ", third, second, first);
		
	}

}

