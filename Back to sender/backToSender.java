import java.util.Scanner;

public class backToSender {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean continueLoop = true;

        while (continueLoop) {
        System.out.print("Enter a number of parcels collected between 0 and 100: ");
        int collectionRate = isValidInput(userInput);

        int basePay = 5000;
        int amountPer;

        if (collectionRate < 50) {
            amountPer = 160;
        } else if (collectionRate <= 59) {
            amountPer = 200;
        } else if (collectionRate <= 69) {
            amountPer = 250;
        } else {
            amountPer = 500;
        }

        int totalPay = basePay + (collectionRate * amountPer);
        System.out.println("Your total pay is: " + totalPay);

        System.out.print("Do you want to calculate again? (yes/no): ");
        String continueRunning = userInput.next().toLowerCase();
        if (continueRunning.equals("yes")) {
            continueLoop = true;
        } else if (continueRunning.equals("no")) {
            continueLoop = false;
            System.out.println("Thank you for using the program.");
        }
        else{
            System.out.println("Invalid input");
            continueLoop = false;
        }
    }
}

    public static int isValidInput(Scanner userInput) {
            while (true) {
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
        }
}