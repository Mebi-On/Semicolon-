import java.util.Scanner;

public class TaskTen {
    
    public static void main(String [] args){
		int validScoreSum = 0;
		int validCount = 0;
		int invalidCount = 0;
		double evenScoreAverage = 0;
		Scanner score = new Scanner(System.in);

		for (int number = 1; number  <= 10; number++){
			System.out.print("Enter score here: ");
			int scores = score.nextInt();
				
			if (0 <= scores <= 100){
				validCount += 1;
				validScoreSum += scores;
				validScoreAverage = validScoreSum/validCount;
			}
			else{
				number -= 1;
			}
		}
		System.out.println("The average of the valid scores is: " + validScoreAverage);
		
	}
}