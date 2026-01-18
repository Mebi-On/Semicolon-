import java.util.Scanner;

public class FindTheTwoLargestNumber{
    public static void main (String[] args){
        int counter = 1;
        int largest = 0;
        int secondLargest = 0;
        int winner = 0;

        Scanner userInput = new Scanner(System.in);

        while (counter < 11){
            System.out.println("Enter number of units sold by sales person " + counter + ":");
            int number = userInput.nextInt();
            
            if(number > largest){
                secondLargest = largest;
                largest = number;
            }
            else if(number > secondLargest){
            secondLargest = number;
            }
            counter ++;
        }
        System.out.println("The two largest numbers are: " + largest + " " + secondLargest);
    }
}