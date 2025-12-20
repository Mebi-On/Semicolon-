import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours > 3) {
            charge += Math.ceil(hours - 3) * 0.5;
        }

        if (charge > 10.0) {
            charge = 10.0;
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalReceipts = 0.0;
        int count = 0;

        while (count != 1) {
            System.out.print("Enter hours parked (-1 to quit): ");
            double hours = input.nextDouble();

            if (hours == -1) {
                count ++;
            }

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Charge: $%.2f%n", charge);
            System.out.printf("Running total: $%.2f%n%n", totalReceipts);
        }
    }
}
