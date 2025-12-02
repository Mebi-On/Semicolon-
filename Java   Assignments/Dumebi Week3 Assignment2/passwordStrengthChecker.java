import java.util.Scanner;

public class passwordStrengthChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 20;
        while (i < 100) {
            System.out.print("Insert your password: ");
            String password = input.next();

            int strength = password.length();
            System.out.println(strength);

            if (10 < strength) {
                System.out.println("Strong");
            } else if (6 < strength && strength <= 10) {
                System.out.println("Medium");
            } else if (6 > strength) {
                System.out.println("Weak");
            } else if (1 > strength) {
                System.out.println("Invalid");
            }
        }
    }
}