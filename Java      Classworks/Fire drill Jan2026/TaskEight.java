public class TaskEight{
	public static void main(String[] args){
		int overallTotal = 0;
		for(int numbers = 1; numbers < 11; numbers++){
			int newNumber = 1;
			int total = 0;
			
			if (numbers % 4 == 0){
				for (int repeat = 0; repeat < 5; repeat++){
					newNumber *= numbers;
					total += newNumber;		
				}
				overallTotal += total;
			}
			
		}
		System.out.println(overallTotal);
		
	}
} 