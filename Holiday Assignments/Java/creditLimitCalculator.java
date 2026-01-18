import java.util.Scanner;

public class creditLimitCalculator{
    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your account number: ");
        int accountNumber = userInput.nextInt();
        
        System.out.println("Enter balance at the beginning of the month: ");
        int initialBalance = userInput.nextInt();

        System.out.println("Enter total of all items charged by the customer this month: ");
        int totalDebits = userInput.nextInt();
        
        System.out.println("Enter total of all credits applied to the customer's account this month ");
        int totalCredits = userInput.nextInt();

        System.out.println("Enter your allowed credit limit: ");
        int creditLimit = userInput.nextInt();
        
        int newBalance = initialBalance + totalDebits - totalCredits;
        System.out.println(newBalance);

        if(newBalance > creditLimit){
            System.out.println("Credit limit exceeded");
        }
        else{
             System.out.println("Credit limit NOT exceeded");
        }
    }
}