import java.util.Scanner;

public class SquareAsterisksModified {
    public static void main (String []args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int rowColomns = userInput.nextInt();

        System.out.print("Enter a character *, #, $ etc: ");
        char fillCharacter = userInput.next().charAt(0);

        int rows, colomns;

        for (rows = 1; rows <= rowColomns; rows++){
            for (colomns = 1; colomns <= rowColomns; colomns++){
                System.out.print(fillCharacter);
            }
            System.out.println(" ");
            
        }
    }
}