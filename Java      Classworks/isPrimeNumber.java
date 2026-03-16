import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

	boolean continueLoop = true;
	while(continueLoop){
        	System.out.print("Enter a number: ");
        	int userNumber = userInput.nextInt();

        	boolean isPrime = true;
        	for (int number = 2; number <= userNumber -1; number++) {
            		if (userNumber % number == 0) {
                	isPrime = false;
                	break;
            		}
        	}
		if (isPrime) {
            		System.out.printf("The number %d is a prime number \n", userNumber);
        	}
        	else{
            		System.out.printf("The number %d is not a prime number \n", userNumber);
		}
		System.out.print("continue? (yes/no): ");
        	String userAnswer = userInput.next();
		if (userAnswer.equals("no")){
			continueLoop = false;
		}
	   }
     }
}