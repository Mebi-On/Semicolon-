import java.util.Scanner;
 
public class pyramid{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter triangle height: ");
		int rows = userInput.nextInt();

		for(int height = 0; height < rows; height ++){
			for (int space = 0; space < (rows - height); space++){
				System.out.print("\t ");
			}

			for (int width = 0; width <= height; width ++){
				System.out.print((int)Math.pow(3, width) + "\t ");
			}
			for (int width = height - 1; width >= 0; width --){
				System.out.print((int)Math.pow(3, width) + "\t");
			}
			System.out.println();

		}
		System.out.println();
	}
} 
