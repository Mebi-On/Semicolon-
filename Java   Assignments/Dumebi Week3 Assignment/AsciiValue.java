import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char character = input.next().charAt(0); 

        int ascii = character;  

        System.out.printf("The ASCII value of %c is %d.\n ", character, ascii);
        }
    }
}
