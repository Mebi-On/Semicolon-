import java.util.Scanner; 

public class numberPatternShort{
	public static void main(String[] args){
		Scanner userIn = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = userIn.nextInt();
		int size = 2 * number -1;
		int centre = number - 1;

		for (int height = 0; height < size; height ++){
			for(int width = 0; width < size; width ++){
				System.out.print(Math.max(Math.abs(width - centre) + 1, Math.abs(height - centre) + 1));
			}
			System.out.println();
		}
	}
} 
