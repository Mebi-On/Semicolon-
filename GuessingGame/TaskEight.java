import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
 
public class TaskEight{
	public static void main(String[] args){
		Random randomInt = new Random();
		Scanner userInput = new Scanner(System.in);
		boolean continueLoop = true;
		int count = 0;
		int[] playerGuesses = new int[10];

        	while (continueLoop) {
			int randomNumebr = randomInt.nextInt(20) + 1;
			if(count >= 10){
				System.out.println("GAME OVER");
				System.out.println(randomNumebr + " is the answer");
				continueLoop = false;
			}
			else{
				System.out.print("Guess a number between 1 and 20: ");
				int usersGuess = userInput.nextInt();
				playerGuesses[count] = usersGuess;
				if(usersGuess > 20 || usersGuess < 0){
					if (usersGuess > 20){
						System.out.println("Too high");
						count++;
					}
					else if(usersGuess < 0){
						System.out.println("Too low");
						count++;
					
					}
				}
				else{	
					if (usersGuess == randomNumebr){
						System.out.println("You are correct");
						System.out.println("You won in " + count + "attempts");
						continueLoop = false;	
					}else{
						System.out.println("You no get am "+ randomNumebr + " is the answer" );
						
						count ++;
					
					}
				}
			}
		}
		float sum = (float) 0.0;
		float average = (float) 0.0;
		int highest = 0;
		int lowest = 1000;
		for (int index = 0; index < 10; index++){
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
	}
}



   
           
