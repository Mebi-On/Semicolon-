import java.util.Scanner;
import java.util.Arrays; 

public class CreditCardValidator {

    public static void main(String[] args) {
        
        Scanner useIinput = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify: ");
        String[] card_number = {useIinput.next()};
        int card_length = card_number.length;
        int count = 0;

        System.out.print(Arrays.toString((card_number)));
        System.out.println(card_length);
        // if (13  card_length < 16){
        //     for (Object elem : col) {
                
        //     }
        // }
        // else{
        //     System.out.println("Invalid Card, incorect Card Number");
        // }
        
    }
}
