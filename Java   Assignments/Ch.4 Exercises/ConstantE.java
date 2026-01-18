import java.util.Scanner;

public class ConstantE {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int numberOfTerms = userInput.nextInt();

        double e = 1.0;
        long factorial = 1;

        for (int integer = 1; integer < numberOfTerms; integer++) {
            factorial *= integer;
            e += 1.0 / factorial;
        }

        System.out.println("Estimated value of e: " + e);
    }
}
