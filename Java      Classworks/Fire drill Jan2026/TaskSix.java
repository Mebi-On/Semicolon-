public class TaskSix{
	public static void main(String[] args){
		
		for(int numbers = 1; numbers < 11; numbers++){
			int newNumber = 1;
			if (numbers % 4 == 0){
				for (int repeat = 0; repeat < 5; repeat++){
					System.out.print(newNumber *= numbers);
					System.out.print(" ");
				}
				System.out.print(" ");
			}
		}
		
	}
} 