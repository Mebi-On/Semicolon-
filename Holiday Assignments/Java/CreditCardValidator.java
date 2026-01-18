import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {
        
        Scanner useIinput = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify: ");
        String digits = useIinput.next();

        int cardLength = digits.length();
        int[] cardNumber = new int[cardLength];
        int[] reversedCard = new int[cardLength];

        for(int index = 0; index < cardLength; index ++){
            int digitChar = digits.charAt(index) - '0';
            cardNumber[index] = digitChar;
        }

        String cardType = " "; 
        String cardValidity = " ";
        int doubledEven = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        
        if (13 <= cardLength && cardLength <= 16){
            if (cardNumber[0] == 4){
                cardType = "Visa Card";
        }
            else if (cardNumber[0] == 5){
                cardType = "MasterCard";
        }
            else if (cardNumber[0] == 3 && cardNumber[1] == 7){
                cardType = "American Express Cards";
        }
            else if (cardNumber[0] == 6){
                cardType = "Discover cards";
        }
            else{
                cardType = "Invalid Card";
        }
            
            for (int index = 0;  index < cardLength; index++ ){
                reversedCard [index] = cardNumber[-index + cardLength - 1];
            }
            //System.out.println(Arrays.toString(reversedCard));

            for (int index = 0; index < cardLength; index++ ){
                if (index % 2 != 0){
                    doubledEven = reversedCard[index] * 2;
                    //System.out.println(reversedCard[index]);
                    if (doubledEven >= 10){
                        evenNumbers += (doubledEven / 10) + (doubledEven % 10);
                    }
                    else{
                        evenNumbers += doubledEven;
                    }
                }
                else{
                    oddNumbers += reversedCard[index];
                }
            }
            if ((evenNumbers + oddNumbers) % 10 == 0){
                cardValidity = "Valid";
            }
            else{
                cardValidity = "Invalid";
            }
        }
        else{
            System.out.println("Invalid Card, incorect Card Number");
        }
        System.out.println("Credit Card Type: " +  cardType);
        System.out.println("Credit Card Number: " + digits);
        System.out.println("Credit Card Digit Length: " + cardLength);
        System.out.println("Credit Card Validity Status: " + cardValidity);

        //System.out.printf("Credit Card Type: %s%nCredit Card Number: %s%nCredit Card Digit Length: %d%nCredit Card Validity Status: %s", cardType, digits, cardLength, cardValidity );
    }
}
