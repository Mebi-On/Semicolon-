import java.util.Scanner;

public class atmSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userBalance = 1000;
        boolean continueTransaction = true;


        while(continueTransaction){
            System.out.print("""
        ATM 
        1. Deposit
        2. Withdraw
        3. Check Balance
        0. Exit  
        
        Enter your choice:
        """);
            int mainMenuInput = input.nextInt();

            switch(mainMenuInput){
                case 1 : 
                    boolean invalidInput = true;
                    while(invalidInput){
                        System.out.print("Enter Amount: ₦");
                       
                        
                        if (input.hasNextInt()) { 
                            int depositAmount = input.nextInt();
                            if (depositAmount <= 0) {
                                System.out.println("Amount must be greater than 0.");
                            }
                            else {
                                userBalance += depositAmount;
                                invalidInput = false;
                                System.out.println("₦" + depositAmount + " has been deposited to your account.\n");
                            }
                        } 
                        else {
                            System.out.println("Invalid input, please enter a valid number.");
                            input.next(); 
                        }
                    }
                    break;

                case 2 :
                    invalidInput = true;
                    while(invalidInput){
                        System.out.print("Enter Amount: ₦");
                        
                        if (input.hasNextInt()) {
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount <= 0) {
                                System.out.println("Amount must be greater than 0.");
                            }
                            else{
                                if (withdrawAmount > userBalance ) {
                                    System.out.println("Insufficient funds \nPlease enter an amount less than or equal to your available balance.");
                                } 
                                else {
                                    userBalance -= withdrawAmount;
                                    invalidInput = false;
                                    System.out.println("₦" + withdrawAmount + " has been withdrawn from your account.\n");
                                }
                            }
                        } 
                        else {
                            System.out.println("Invalid input, please enter a valid number.");
                            input.next();
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Available balance is: ₦" + userBalance);
                    break;
                case 0:
                    continueTransaction = false;
                    System.out.println("Exiting ATM");
                    break;
                default:
                    System.out.println("Invalid input, please try again");
            }
        }
    }
}
