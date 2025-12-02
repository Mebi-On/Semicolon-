import java.util.Scanner;

public class intrest {
    public static void main(String[] args) {

        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter loan duration in years: ");
        int time = input.nextInt();

        double simpleInterest = (principalAmount * rate * time) / 100;

        System.out.printf("The interest on the loan is %.2f%n", simpleInterest);
        }
    }
}
