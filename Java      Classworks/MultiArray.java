import java.util.Scanner; 
import java.util.Arrays; 



public class MultiArray{
	public static void main (String [] args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Input your array rows");
		int row = userInput.nextInt();
		System.out.println("Input your array columns");
		int column = userInput.nextInt();

		int [] [] numbers = new int [row] [column];  

		for (int rowindex = 0; rowindex < numbers.length; rowindex ++){
			System.out.println("Input your numbers for this array");
			for (int columnindex = 0; columnindex < numbers[rowindex].length; columnindex ++){ 
				numbers[rowindex][columnindex] = userInput.nextInt();
			}
		}
	System.out.println(Arrays.deepToString(numbers));
	}
}