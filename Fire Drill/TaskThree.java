import java.util.Scanner;

public class TaskThree {
    
    public static void main(String [] args){
		int scoreSum = 0;
		double scoreAverage = 0;
		Scanner score = new Scanner(System.in);

		for (int number = 1; number <= 10; number++){
			System.out.print("Enter score here: ");
			int scores = score.nextInt();
			scoreSum += scores;
			scoreAverage = scoreSum / 10.0;
		}
	System.out.println("The sum of the scores is: " + scoreSum);
	System.out.println("The average of the scores is: " + scoreAverage);
	}
}