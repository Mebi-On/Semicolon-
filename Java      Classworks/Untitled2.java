

import java.util.Scanner; 
import java.util.Arrays; 



public class Untitled2{
	public static void main (String [] args){
		int[][] grades = new int [4][4];

		Scanner userInput = new Scanner(System.in);

		for (int student = 0; student < grades.length; student++) {
			for (int grade = 0; grade < grades[student].length; grade++) {
				System.out.print("Enter grade for student " + (student + 1)  + " Test " + (grade + 1) + ": "); 
				grades[student][grade] = userInput.nextInt();
			}
		}	
		System.out.printf("The grades are:%n%n");
		System.out.print("            ");

		for (int test = 0; test < grades[0].length; test++) {
			System.out.printf("Test %d  ", test + 1);
		}
		System.out.println();

		for (int student = 0; student < grades.length; student++) {
			System.out.printf("Student %2d", student + 1);

			for (int test : grades[student]) { 
				System.out.printf("%8d", test);
			}	
			System.out.println();
		}
	}
}