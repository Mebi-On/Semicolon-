import java.util.Scanner;

public class TaskEight {
    
    public static void main(String [] args){
		int validScoreSum = 0;
		Scanner score = new Scanner(System.in);

		for (int number = 1; number  <= 10; number++){
			System.out.print("Enter score here: ");
			int scores = score.nextInt();
				
			if (0 <= scores && scores <= 100){
				validScoreSum += scores;

			}
			else{
				number -= 1;
			}
		}
		System.out.println("The sum of the scores is: " + validScoreSum);

		
	}
}