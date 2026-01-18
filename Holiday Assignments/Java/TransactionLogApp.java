import java.util.ArrayList;
import java.util.Scanner;

public class TransactionLogApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int newBalance = 0;
        ArrayList<String> transactionList = new ArrayList<>();
        boolean continueMainMenu = true;
        while (continueMainMenu) {
            System.out.print("""
                Transaction Log App

                1. Deposit
                2. Withdraw
                3. Show Transactions
                4. Exit

                Enter here:
                """);

            int choice = input.nextInt();

            switch (choice) {

                case 1 ->  {
            boolean continueDeposit = true;
		    while (continueDeposit){
                    System.out.print("Enter deposit amount: ₦");
                    int amount = input.nextInt();
		    if (amount > 0){
                        newBalance += amount;

                        String transaction = "Deposited: ₦" + amount + " | New Balance: ₦" + newBalance;

                        transactionList.add(transaction);
                        System.out.println(transaction);
                        System.out.println();
			break;
		    }
		    else{
			System.out.println("Invalid amount");
		    }
                }}

                case 2 ->  {
            boolean continueWithdraw = true;
		    while (continueWithdraw){
                    System.out.print("Enter withdrawal amount: ₦");
                    int amount = input.nextInt();
		    if (amount > 0){
                if (amount > newBalance){
                    System.out.println("Insufficient funds. Available balance: ₦" + newBalance);
                    continue;
                }
                else{
                         newBalance -= amount;

                        String transaction = "Withdrew: ₦" + amount + " | New Balance: ₦" + newBalance;

                        transactionList.add(transaction);
                        System.out.println(transaction);
                        System.out.println();
			            break;
                }
			}
		    else{
			System.out.println("Invalid amount");
		    }}
                }

                case 3 ->  {
                    if (transactionList.isEmpty()) {
                        System.out.println("No transactions yet.");
                    } else {
                        for (int i = 0; i < transactionList.size(); i++) {
                            System.out.println((i + 1) + ". " + transactionList.get(i));
                        }
                    }
                    System.out.println();
                }

                case 4 -> {
                    System.out.println("Final Balance: ₦" + newBalance);
                    input.close();
                    return;
                }

                default -> 
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
