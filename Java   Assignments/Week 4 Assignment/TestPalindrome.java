import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int reversed = PalindromeNumber.reverse(number);
        boolean result = PalindromeNumber.isPalindrome(number);

        System.out.println("Reversed: " + reversed);

        if (result) {
            System.out.println("Is a palindrome.");
        } else {
            System.out.println("Is not a palindrome.");
        }
    }
}
