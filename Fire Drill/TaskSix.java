import java.util.Scanner;

public class TaskSix {
    
    public static void main(String [] args){
		int evenScoreSum = 0;
		int evenCount = 0;
		double evenScoreAverage = 0;
		Scanner score = new Scanner(System.in);

		for (int number = 1; number  <= 10; number++){
			
			System.out.print("Enter score here: ");
			int scores = score.nextInt();
				
			if (scores % 2 == 0){
				evenCount += 1;
				evenScoreSum += scores;
				evenScoreAverage = evenScoreSum/evenCount;
			}
		}
		System.out.println("The average of the even scores is: " + evenScoreAverage);
		
	}
}