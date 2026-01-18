import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Annual Income: ");
        int income = input.nextInt();
        System.out.print("Enter your Years of Experience: ");
        int yearsOfExperience = input.nextInt();
        System.out.print("Enter your Credit Score: ");
        int cretitScore = input.nextInt();

        int loanAmount = income * 5;


        if (cretitScore >= 0 && cretitScore <= 850)  {
            if (income >= 350000 && yearsOfExperience >= 2 && cretitScore >= 650) {
                System.out.println("Eligible for Loan, your loan amount is: " + loanAmount);
            } else {
                System.out.println("Not Eligible for Loan");
            }
        } else{
            System.out.println("Invalid Credit Score");
        }
    }
}