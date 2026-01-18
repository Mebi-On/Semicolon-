// write a program find the thief

// Ask the user for names until the name "thief" is inputed

import java.util.Scanner;

public class nameOfThief{
	public static void main (String [] args){
	Scanner userInput = new Scanner (System.in);
	int count = 0;
	String names = " ";

	//while(count < 1){
		//System.out.print("Enter a name here: ");
		//String names = userInput.next();
		//if (!names.equalsIgnoreCase("Thief")){
			//continue;
			}
		//else {
			//System.out.println("Thief found!!! ");
			//count += 1;
			//}
		//}
	
	while(!names.equalsIgnoreCase("Thief")){
		System.out.print("Enter a name here: ");
		String names = userInput.next();
		
			}
	System.out.println("Thief found!!! ");
		}
	}
} 
