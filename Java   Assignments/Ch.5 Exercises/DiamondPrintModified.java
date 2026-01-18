import java.util.Scanner;

public class DiamondPrintModified{
    public static void main (String [] arg){

        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter an odd number between 1 - 19: ");

        int middleNumber = userInput.nextInt();

        if (middleNumber % 2 != 0 && middleNumber >= 1 && middleNumber <= 19){

        int row, space, star;

        for (row = 1; row <= middleNumber; row++){
            for (space = 1; space <= middleNumber - row; space++){
                System.out.print(" ");
                }
            for( star = 1; star <= row * 2 - 1; star++){
                System.out.print("*");
            }

            System.out.println();
        }
            for (row = middleNumber - 1; row > 0 ; row--){
            for (space = 1; space <= middleNumber - row; space++){
                System.out.print(" ");
            }
            for( star = 1; star <= row * 2 - 1; star++){
                    System.out.print("*");
                }
             System.out.println();
            }
        }
        else{
            System.out.println("Invalid Input, retry");
        }
    }
}
