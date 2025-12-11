import java.util.Scanner;

public class TestMilesKilometerConversion {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter if youre converting miles or kilometers: ");
        String choice = userInput.nextLine().toLowerCase();
        if (choice.equals("miles")){
            System.out.print("Enter miles: ");
            double miles = userInput.nextDouble();
            System.out.println(miles + " miles = " +
                    MilesKilometerConversion.mileToKilometer(miles) + " km");
        }
        else if (choice.equals("kilometers")){
            System.out.print("Enter kilometers: ");
            double km = userInput.nextDouble();
            System.out.println(km + " km = " +
                    MilesKilometerConversion.kilometerToMile(km) + " miles");
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
}
