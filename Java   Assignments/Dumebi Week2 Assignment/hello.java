import java.util.Scanner;

public class hello{

    public static void main(String[] args) {
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four first name: ");
            String firstName = input.next();
        
        System.out.print("Enter a four first name: ");
            String lastName = input.next();

            System.out.printf("Hello, %s %s%n", firstName, lastName);
        }
    }
}
