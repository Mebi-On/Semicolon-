import java.util.Scanner;

public class RoundingIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        while (count != 1) {
            System.out.print("Enter a decimal number (-1 to quit): ");
            double x = input.nextDouble();

            if (x == -1) {
                count ++;
            }

            double rounded = Math.floor(x + 0.5);

            System.out.printf("Original: %.2f  Rounded: %.0f%n%n", x, rounded);
        }
    }
}
