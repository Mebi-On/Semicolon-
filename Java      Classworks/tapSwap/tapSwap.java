import java.util.Arrays; 

public class tapSwap{
	public static int[] tapSwapArray(int [] numbers){
		//int [] numbers = {5, 7, 6, 3, 2, 4};
		//int [] numbers = {2, 5, 7, 4, 6};
		//System.out.println(Arrays.toString(numbers));
		for(int index = 0; index < numbers.length - 1; index += 2){
			int temp = numbers[index];
            		numbers[index] = numbers[index + 1];
            		numbers[index + 1] = temp;
		}
		return numbers;
		//System.out.println(Arrays.toString(numbers));
	}
}