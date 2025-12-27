import java.util.Scanner;

public class MortgageCalculator {

    public static void mortgageCalculator() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble() / 1200;

        System.out.print("Enter the duration in years: ");
        int loanDuration = input.nextInt() * 12;

        double monthlyPayment = principalAmount *
                (annualInterestRate * Math.pow(1 + annualInterestRate, loanDuration)) /
                (Math.pow(1 + annualInterestRate, loanDuration) - 1);

        System.out.printf("Your monthly payment is %.2f%n", monthlyPayment);
    }

    public static void main(String[] args) {
        mortgageCalculator();
    }
}
