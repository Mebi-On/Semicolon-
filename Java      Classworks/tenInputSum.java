//Collect 10 from user using 1 input and find the sum
import java.util.Scanner;
 
public class tenInputSum{ 
	public static void main(String[] args) {
		int sum = 0;
		//int count = 1;
		Scanner input = new Scanner(System.in);

		for (int count = 1; count <= 10; count++){
			System.out.print("Enter a value: ");
                	int userInput = input.nextInt();
			sum += userInput;
	 
		}
		//while (count <= 10){
		//	System.out.print("Enter a value: ");
                //	int userInput = input.nextInt();
		//	sum += userInput;
		//	count += 1;
		//}
	System.out.printf("The sum of your numbers is: %d%n", sum);

	}
}