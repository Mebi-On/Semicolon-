import java.util.Scanner;
import java.util.Random;
 
public class TaskTwo{
	public static void main(String[] args){
		Random randomInt = new Random();
		Scanner userInput = new Scanner(System.in);
		int randomNumebr = randomInt.nextInt(20) + 1;
		System.out.print("Guess a number between 1 and 20: ");
		int usersGuess = userInput.nextInt();
		if (usersGuess == randomNumebr){
			System.out.println("You are correct");	
		}else{
			System.out.println("You no get am "+ randomNumebr + " is the answer" );
				
			

		}
	}
}