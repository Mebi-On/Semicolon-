import java.util.Scanner;
import java.util.Random;
 
public class TaskSix{
	public static void main(String[] args){
		Random randomInt = new Random();
		Scanner userInput = new Scanner(System.in);
		boolean continueLoop = true;
		int count = 0;
		int randomNumebr = randomInt.nextInt(20) + 1;
        	while (continueLoop) {
			
			if(count >= 10){
				System.out.print("\nGAME OVER");
				System.out.print(randomNumebr + " is the answer");
				continueLoop = false;
			}
			else{
				System.out.print("Guess a number between 1 and 20: ");
				int usersGuess = userInput.nextInt();
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
						System.out.println("\nYou won in " + count + "attempts");
						continueLoop = false;	
					}else{
						System.out.println("You no get am "+ randomNumebr + " is the answer" );
						count ++;
					
					}
				}
			}
		}
	}
}



   
           
