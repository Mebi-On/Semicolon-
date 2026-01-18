import java.util.Scanner;

public class SquareAsterisks {
    public static void main (String []args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int rowColomns = userInput.nextInt();
        int rows, colomns;

        for (rows = 1; rows <= rowColomns; rows++){
            for (colomns = 1; colomns <= rowColomns; colomns++){
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
    }
}