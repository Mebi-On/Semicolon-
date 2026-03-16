import java.util.Scanner;

public class BackToSenderTools{
        public static void totalEarnings(int collectionRate, int amountPerParcel) {
        int baseSalary = 5000;
        int totalEarnings = baseSalary + (collectionRate * amountPerParcel);
        System.out.println("Total earnings is : " + totalEarnings);
    }

    public static void backToSender(Scanner userInput) {
        boolean continueWorking = true;

        while (continueWorking) {

            System.out.print("Enter a number of parcels collected between 0 and 100: ");

            int collectionRate = ValidInt(userInput);
            int amountPerParcel;

            if (collectionRate < 50) {
                amountPerParcel = 160;
            } 
            else if (collectionRate <= 59) {
                amountPerParcel = 200;
            } 
            else if (collectionRate <= 69) {
                amountPerParcel = 250;
            } 
            else {
                amountPerParcel = 500;
            }

            totalEarnings(collectionRate, amountPerParcel);
            
            boolean continueRepeating = true;
            while (continueRepeating) {
                System.out.print("Do you want to calculate again? (y/n): ");
                String continueRunning = userInput.next().toLowerCase();

                if (continueRunning.equals("y")) {
                    break;
                } 
                else if (continueRunning.equals("n")) {
                    continueWorking = false;
                    System.out.println("Thank you for using the program.");
                    break;
                } 
                else {
                    System.out.println("Invalid input");
                }
            }
        }
    }

    public static int ValidInt(Scanner userInput) {
        boolean isValid = true;
        int value = 0;
        while (isValid) {

            if (userInput.hasNextInt()) {
                value = userInput.nextInt();

                if (value >= 0 && value <= 100) {
                    isValid = false;
                    return value;
                } 
                else {
                    System.out.print("Input must be between 0 and 100: ");
                }
            } 
            else {
                System.out.print("Invalid input. Enter an integer: ");
                userInput.next(); 
            }
        }
        return value;
    }
}