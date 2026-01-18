import java.util.Scanner;

public class CompoundInterestModified {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();



        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = input.nextInt();      

        for (double rate = 5; rate <= 10; rate++){
            double r = rate / 100;

            double amount = principal * Math.pow((1 + r / n), n * years);
            double interest = amount - principal;
            
            System.out.printf("Final Amount: %.2f%n", amount);
            System.out.printf("Interest: %.2f%n", interest);
        }
        input.close();
    }
}
