import java.util.Scanner;

public class PizzaWahala {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Number of people = ");
        int numberOfPeople = userInput.nextInt();
        userInput.nextLine();
	if (numberOfPeople <= 0){
        System.out.println("Invalid Input");
    } else {
	System.out.print(
    """
    Pizza type \t No. of slices \t Prices
    1. Sapa Size \t 4 slices \t 2000
    2. Small Money \t 6 slices \t 2400
    3. Big Boys  \t 8 slices \t 3000
    4. Odogwu \t 12 slices \t 4200
    """);

        System.out.print("Piza type = ");
        String pizzaType = userInput.nextLine().toLowerCase();
        System.out.println(pizzaType);

        int numberOfSlices = 0;
        int pricePerBox = 0;
        int numberOfBoxes = 0;
        int leftOver = 0;
        int price = 0;

            switch (pizzaType) {
                case "sapa size":
                    numberOfSlices = 4;
                    pricePerBox = 2000;

                case "small money":
                    numberOfSlices = 6;
                    pricePerBox = 2400;

                case "big boys":
                    numberOfSlices = 8;
                    pricePerBox = 3000;

                case "odogwu":
                    numberOfSlices = 12;
                    pricePerBox = 4200;
    
                default:
                    System.out.println("Invalid Input");
                    break;
                
                    
            }
        numberOfBoxes = (numberOfPeople + numberOfSlices - 1) / numberOfSlices;
        leftOver = (numberOfBoxes * numberOfSlices) - numberOfPeople;
        price = pricePerBox * numberOfBoxes;

        System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");
        System.out.println("Number left over slice after serving = " + leftOver + " slices");
        System.out.println("Prices = " + price);	
	    }
    }
}
        