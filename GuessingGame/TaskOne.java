import java.util.Scanner;
import java.util.Random;
 
public class TaskOne{
	public static void main(String[] args){
		Random randomInt = new Random();
		Scanner userInput = new Scanner(System.in);
		int randomNumebr = randomInt.nextInt(10) + 1;
		System.out.println(randomNumebr);
	}
}