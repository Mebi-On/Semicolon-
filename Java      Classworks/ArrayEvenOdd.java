import java.util.Scanner; 
import java.util.Arrays; 



public class ArrayEvenOdd{
	public static void main (String [] args){
		//int[] numbers = {2, 5, 7, 8, 11};
		Scanner userInput = new Scanner(System.in);
		int [] [] numbers = new int [3] [4];  
		for (int rowindex = 0; rowindex < numbers.length; rowindex ++){
			System.out.println("Input your numbers for this array");
			for (int coloumnindex = 0; coloumnindex < numbers[rowindex].length; coloumnindex ++){ //coloumnindex < numbers[rowindex].length is needed as it the rows and columns may be uneven 
				numbers[rowindex][coloumnindex] = userInput.nextInt();
				}
			}
		//for (int number : numbers){
			//System.out.print(number + " ")
			//}
		//for (int index = 0; index < numbers.length; index ++){ 
			//if (numbers[index] % 2 == 0 ){
				//numbers[index] = numbers[index] * numbers[index];
			//}
			//else{
				//numbers[index] = numbers[index] + 1;
			//}	
		//}
		//System.out.println(Arrays.deepToString(numbers));
		//System.out.println(numbers[-1]); //Not possible in Java
	

	}
}