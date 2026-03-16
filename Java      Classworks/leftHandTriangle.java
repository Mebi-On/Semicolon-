import java.util.Scanner;
 
public class leftHandTriangle{
	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter height of triangle: ");
		int rows = userInput.nextInt();
		
		for(int height = 1; height <= rows; height ++){
			for (int space = 1; space <= rows - height; space++){
				System.out.print("  ");
			}

			for (int width = height ; width > 0; width --){
				System.out.print(width + " ");
			}
		System.out.println();
		}
	}
}