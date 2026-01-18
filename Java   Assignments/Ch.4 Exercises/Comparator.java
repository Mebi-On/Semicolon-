import java.util.Scanner;

public class Comparator{
    public static void main (String [] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = userInput.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = userInput.nextInt();

        if (firstNumber > secondNumber){
            System.out.println(1);
        } else if (secondNumber > firstNumber){
            System.out.println(-1);
        } else {
            System.out.println(0);
        }

        userInput.close();
    }
}