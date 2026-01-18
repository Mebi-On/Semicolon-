import java.util.Scanner;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int counter = 1;

        while (counter <= 3) {

            System.out.print("Enter citizen name: ");
            String name = userInput.next();

            System.out.print("Enter yearly earnings: ");
            double earnings = userInput.nextDouble();

            double tax;

            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = (30000 * 0.15) + ((earnings - 30000) * 0.20);
            }

            System.out.printf("Citizen: %s%n", name);
            System.out.printf("Total tax: $%.2f%n%n", tax);

            counter++;
        }

        userInput.close();
    }
}
