import java.util.Scanner;

public class squareCube {
    
    public static void main(String[] args) {
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
            int num = input.nextInt();
        
            int square = num * num;
            int cube = num ^3;

            System.out.printf("The square of your number is %d and the cube is %d%n", square, cube);
        }
    }
}
