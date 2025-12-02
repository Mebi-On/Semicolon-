import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {

            int i =20; 

            while (i < 100){ 
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.printf("%d is even.%n", num);
            } else {
                System.out.printf("%d is odd.%n", num);
            }
        }
    }
}
