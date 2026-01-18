import java.util.Scanner;

public class EExpoonentialX {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        double x = userInput.nextDouble();

        System.out.print("Enter number of terms: ");
        int terms = userInput.nextInt();

        double result = 1.0;
        long factorial = 1;
        double power = 1.0;

        for (int integer = 1; integer < terms; integer++) {
            power *= x;
            factorial *= integer;
            result += power / factorial;
        }
        System.out.println("Value of e^x: " + result);
    }
}
