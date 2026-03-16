import java.util.Scanner; 

public class numberPattern{
	public static void main(String[] args){
		Scanner userIn = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = userIn.nextInt();
		int size = 2 * number -1;
		int centre = number - 1;

		for (int height = 0; height < size/2 + 1; height ++){
			for(int width = 0; width < size/2; width ++){
				int a = (centre  - width) + 1;
				int b = (centre - height) + 1;
				if(a > b){
					System.out.print(a);
				}
				else{
					System.out.print(b);
				}
			}

			for(int width = size /2 ; width > -1; width --){
				int a = (centre  - width) + 1;
				int b = (centre - height) + 1;
				if(a > b){
					System.out.print(a);
				}
				else{
					System.out.print(b);
				}
			}
			System.out.println();
		}
		for (int height = size/2 - 1; height > -1 ; height --){
			for(int width = 0  ; width < size /2; width ++){
				int a = (centre  - width) + 1;
				int b = (centre - height) + 1; 
				if(a > b){
					System.out.print(a);
				}
				else{
					System.out.print(b);
				}
			}
			for(int width = size/2; width > -1 ; width --){
				int a = (centre  - width) + 1;
				int b = (centre - height) + 1;
				if(a > b){
					System.out.print(a);
				}
				else{
					System.out.print(b);
				}

			}
			System.out.println();
		}
	}
} 