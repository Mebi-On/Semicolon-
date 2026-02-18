public class TaskFive{
	public static void main(String[] args){
		for(int numbers = 1; numbers < 11; numbers++){
			if (numbers % 4 == 0){
				for (int repeat = 0; repeat < 5; repeat++){
					System.out.print(numbers);
				}
				System.out.print(" ");
			}
		}
		
	}
} 