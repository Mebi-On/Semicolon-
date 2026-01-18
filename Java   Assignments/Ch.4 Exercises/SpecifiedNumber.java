import java.util.Scanner;

public class SpecifiedNumber{
    public static void main (String [] args){

        System.out.print("Specify a number: ");
        Scanner userInput = new Scanner(System.in);
        int specifiedSum = userInput.nextInt();
        int sum = 0;

        while(sum < specifiedSum){
            System.out.print("Enter a number: ");
            int number = userInput.nextInt();
            sum += number;
            }
        System.out.println("The sum is: " + sum);
        userInput.close();
    }
}