import java.util.Scanner;

public class TestLetterCount {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = userInput.nextLine();

        int result = LetterCount.countLetters(s);

        System.out.println("Number of letters: " + result);
    }
}