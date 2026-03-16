import java.util.Scanner;
 
public class KASHAMADUPE{
	public static void main(String[] args){
		String word = "KASHAMADUPE";
		for (int row = 0; row < word.length(); row ++){
			for(int space = 0; space < row; space ++ ){
				System.out.print("  ");
			}
			for (int index = row; index < word.length(); index++){
				System.out.print(word.charAt(index) + " ");
			}
			System.out.println();
		}
		
	}
}