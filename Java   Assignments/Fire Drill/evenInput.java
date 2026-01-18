//collects 10 inputs 
// tells if its even or not

import java.util.Scanner;

public class evenInput{
	public static void main (String [] args){
		Scanner userInput = new Scanner(System.in);

		for (int numbers = 1; numbers <= 10; numbers ++){
			System.out.print("Enter a number here to check if even: ");
			int number = userInput.nextInt();

			if (number % 2 == 0){
				System.out.println(number + " is Even");
			}
		
			
		}
	}
}

