import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
 
public class TaskNine{
	public static void main(String[] args){
		Random randomInt = new Random();
		Scanner userInput = new Scanner(System.in);
		boolean continueLoop = true;
		int count = 0;
		int highguess = 0;
		int lowguess = 0;
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
						highguess++;
					}
					else if(usersGuess < randomNumebr){
						System.out.println("Too low");
						lowguess++;
					
					}
					count++;

				}
				else{	
					if (usersGuess == randomNumebr){
						System.out.println("You are correct");
						System.out.println("You won in " + count + " attempts");
						continueLoop = false;	
					}else{
						System.out.println("\nYou no get am "+ randomNumebr + " is the answer" );
						
						count++;
					
					}
				}
			}
		}
		float sum = (float) 0.0;
		float average = (float) 0.0;
		int highest = playerGuesses[0];
		int lowest = playerGuesses[0];
		for (int index = 0; index < count; index++){
			sum += playerGuesses[index];
			if (playerGuesses[index] > highest){
				highest = playerGuesses[index];
			}
			if (playerGuesses[index] < lowest){
				lowest = playerGuesses[index];
			}
		}
		average = (float) (sum / 10.0);
		System.out.println("Highest: " + highest);
		System.out.println("Lowest: " + lowest);
		System.out.println("Average: " + average);
		System.out.println("Number of too highs: " + highguess);
		System.out.println("Number of too lows: " + lowguess);
	}
}



   
           
