import java.util.Scanner;

public class TaskFive {
    
    public static void main(String [] args){
		int evenScoreSum = 0;
		Scanner score = new Scanner(System.in);

		for (int number = 1; number  <= 10; number++){
			System.out.print("Enter score here: ");
			int scores = score.nextInt();
				
			if (scores % 2 == 0){
				evenScoreSum += scores;
			}
		}
		System.out.println("The sum of the even indexed scores is: " + evenScoreSum);
		
	}
}