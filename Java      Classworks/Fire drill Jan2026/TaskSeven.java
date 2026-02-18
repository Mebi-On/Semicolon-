public class TaskSeven{
	public static void main(String[] args){
		
		for(int numbers = 1; numbers < 11; numbers++){
			int newNumber = 1;
			int total = 0;
			if (numbers % 4 == 0){
				for (int repeat = 0; repeat < 5; repeat++){
					newNumber *= numbers;
					total += newNumber;
				}
				System.out.print(total);
				System.out.print(" ");
			}
		}
		
	}
} 