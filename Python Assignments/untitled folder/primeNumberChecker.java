import java.util.Scanner;

public class primeNumberChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = userInput.nextInt();

        boolean isPrime = true;
        for (int number = 2; number <= userNumber / 2; number++) {
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

        System.out.printf("All prime numbers between 1 and %d are: ", userNumber);
        for (int numbers = 1; numbers < userNumber; numbers++){
            boolean prime = true;
            for (int number = 2; number < numbers/2 + 1; number++ ){
                if (numbers % number == 0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.print(numbers + " ");
            }
        }
        System.out.println();
    }
}