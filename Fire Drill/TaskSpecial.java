// Write a program that collects 10 user name and user score 



import java.util.Scanner;

public class TaskSpecial {

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		for (int userNames = 1; userNames <= 10; userNames++){
			System.out.print("Enter user name here: ");
			String names = input.next();

			System.out.print("Enter user age here: ");
			int ages = input.nextInt();
		}
	}
}
