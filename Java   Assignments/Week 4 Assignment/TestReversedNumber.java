import java.util.Scanner;

public class TestReversedNumber {
    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter a number to be reversed: ");
	    int numbers = userInput.nextInt();

        int reversed = ReversedNumber.reverse(numbers);
        System.out.println("Reversed number: " + reversed);
    }
}
