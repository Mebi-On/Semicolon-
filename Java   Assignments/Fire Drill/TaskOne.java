
import java.util.Scanner;

public class TaskOne {
    
    public static void main(String [] args){
		int scoreSum = 0;
		Scanner score = new Scanner(System.in);

		for (int number = 1; number <= 10; number++){
			System.out.print("Enter score here: ");
			int scores = score.nextInt();
			scoreSum += scores;
		}
		System.out.printf("The sum of the 10 scores is: %d%n",scoreSum);
	}
}
