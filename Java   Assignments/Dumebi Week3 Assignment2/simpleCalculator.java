import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int int_1 = input.nextInt();

        System.out.print("Enter your operation (+, -, *, /) ");
        String operand = input.next();

        System.out.print("Enter a number: ");
        int int_2 = input.nextInt();

        if (operand.equals("+")) {
            int result = int_1 + int_2;
            System.out.println(result);
        } else if (operand.equals("-")) {
            int result = int_1 - int_2;
                System.out.println(result);
            } else if (operand.equals("*")) {
                int result = int_1 * int_2;
                System.out.println(result);
            } else if (operand.equals("/")) {
                int result = int_1 / int_2;
                System.out.println(result);
            } else {
                System.out.println("Error");
            }
        
    }
}