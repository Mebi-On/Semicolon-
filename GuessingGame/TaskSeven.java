import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
 
public class TaskSeven{
	public static void main(String[] args){
		Random randomInt = new Random();
		Scanner userInput = new Scanner(System.in);
		boolean continueLoop = true;
		int count = 0;
		int[] playerGuesses = new int[10];
		int randomNumebr = randomInt.nextInt(20) + 1;

        	while (continueLoop) {
			
			if(count >= 10){
				System.out.println("\nGAME OVER");
				System.out.println(randomNumebr + " is the answer");
				continueLoop = false;
			}
			else{
				System.out.print("Guess a number between 1 and 20: ");
				int usersGuess = userInput.nextInt();
				playerGuesses[count] = usersGuess;
				if(usersGuess > randomNumebr || usersGuess < randomNumebr){
					if (usersGuess > randomNumebr){
						System.out.println("Too high");
					}
					else if(usersGuess < randomNumebr){
						System.out.println("Too low");
					
					}
					count++;

				}
				else{	
					if (usersGuess == randomNumebr){
						System.out.println("You are correct");
						System.out.println("You won in " + count + " attempts");
						continueLoop = false;	
					}else{
						System.out.println("You no get am "+ randomNumebr + " is the answer" );
						
						count ++;
					
					}
				}
			}
		}
		System.out.println(Arrays.toString(playerGuesses));
	}
}



   
           
