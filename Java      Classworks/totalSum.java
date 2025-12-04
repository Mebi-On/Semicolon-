//Write a program that adds the first 1000 numbers 

public class totalSum{ 
	public static void main(String[] args) {
		int totalSum = 0;
		int count = 0;
	
		while(count < 1001){
			totalSum += count;
			count += 1;
		}
 
		//for (int i = 1; i < 1001; i++) {
		//	totalSum += i;
		//}
	System.out.printf("The sum of 1 to 1000 is %d%n",totalSum);
	}
}