import java.util.Scanner;

public class InputValidator {
    public static int isValidInput(Scanner userInput) {
        boolean isValid = true;
        while (isValid) { 
            if (userInput.hasNextInt()) {
                int value = userInput.nextInt();
            
                if (value > 0) {
                    return value;
                } else {
                    System.out.print("Input must not be less than 0. Enter a positive integer: ");
                }
            } else {
                System.out.print("Invalid input. Enter an integer: ");
                userInput.next();
            }
        }
        return 0;
    }
}