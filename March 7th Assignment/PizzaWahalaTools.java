import java.util.Scanner;

public class PizzaWahalaTools{
    public static void pizzaWahala(Scanner input) {

        boolean continueWorking = true;

        while (continueWorking) {

            System.out.print("Number of people = ");
            int numberOfPeople = validInt(input, 100);

            System.out.println("""
            Pizza type
            1. Sapa Size, 4 slices, ₦2000
            2. Small Money, 6 slices, ₦2400
            3. Big Boys, 8 slices, ₦3000
            4. Odogwu, 12 slices, ₦4200
            """);

            System.out.print("Pizza type number = ");
            String pizzaType = input.next();

            int numberOfSlices = 0;
            int pricePerBox = 0;

            switch (pizzaType) {

                case "1":
                    numberOfSlices = 4;
                    pricePerBox = 2000;
                    break;

                case "2":
                    numberOfSlices = 6;
                    pricePerBox = 2400;
                    break;

                case "3":
                    numberOfSlices = 8;
                    pricePerBox = 3000;
                    break;

                case "4":
                    numberOfSlices = 12;
                    pricePerBox = 4200;
                    break;

                default:
                    System.out.println("Invalid Input");
                    continue;
            }

            numberOfBoxesLeftOverAndPrice(numberOfSlices, numberOfPeople, pricePerBox);

            boolean continueRepeating = true;
            while (continueRepeating) {
                System.out.print("Do you want to go again? (y/n): ");
                String continueRunning = input.next().toLowerCase();

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

    public static void numberOfBoxesLeftOverAndPrice(int numberOfSlices, int numberOfPeople, int pricePerBox) {

        int numberOfBoxes = (numberOfPeople + numberOfSlices - 1) / numberOfSlices;
        int leftOver = (numberOfBoxes * numberOfSlices) - numberOfPeople;
        int price = pricePerBox * numberOfBoxes;

        System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");
        System.out.println("Number left over slice after serving = " + leftOver + " slices");
        System.out.println("Prices = ₦" + price);
    }

    public static int validInt(Scanner input, int limit) {
        boolean isValid = true;
        int value = 0;
        while (isValid) {
            if (input.hasNextInt()) {
                value = input.nextInt();

                if (value >= 0 && value <= limit) {
                    isValid = false;
                    return value;
                }
                else {
                    System.out.print("Invalid input. Please enter a valid number: ");
                }
            }
            else {
                System.out.print("Invalid input. Please enter a valid number: ");
                input.next();
            }
        }
        return value;
    }

}