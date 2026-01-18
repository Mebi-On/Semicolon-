import java.util.Scanner;

public class Palindromes{
    public static void main (String [] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the a 5 digit number: ");
        int number = userInput.nextInt();

        if (number < 10000 || number > 99999) {
            System.out.println("Error: The number must be a 5 digit number.");
        } else {
            int firstDigit = number / 10000;
            int secondDigit = (number / 1000) % 10;
            int fourthDigit = (number / 10) % 10;
            int fifthDigit = number % 10;

            if (firstDigit == fifthDigit && secondDigit == fourthDigit) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }

        userInput.close();
    }
}