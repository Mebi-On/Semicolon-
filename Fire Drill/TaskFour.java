import java.util.Scanner;

public class TaskFour {
    
    public static void main(String [] args){
		int scoreSum = 0;
		Scanner score = new Scanner(System.in);

		for (int number = 1; number  <= 10; number++){
			System.out.print("Enter score here: ");
			int scores = score.nextInt();
				
			if (number % 2 == 0){
				scoreSum += scores;
			}
		}
	System.out.println("The sum of the even indexed scores is: " + scoreSum);
		
	}
}