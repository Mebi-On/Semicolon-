import java.util.Scanner;

public class PizzaWahala {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Number of people = ");
        int numberOfPeople = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Piza type = ");
        String pizzaType = userInput.nextLine().toLowerCase();
        System.out.println(pizzaType);

        int numberOfSlices = 0;
        int pricePerBox = 0;
        int numberOfBoxes = 0;
        int leftOver = 0;
        int price = 0;

        if(pizzaType.equals("sapa size")){
            numberOfSlices = 4;
            pricePerBox = 2000;
            numberOfBoxes = (numberOfPeople + numberOfSlices - 1) / numberOfSlices;
            leftOver = (numberOfBoxes * numberOfSlices) - numberOfPeople;
            price = pricePerBox * numberOfBoxes;
        }

        else if (pizzaType.equals("small money")) {
            numberOfSlices = 6;
            pricePerBox = 2400;
            numberOfBoxes = (numberOfPeople + numberOfSlices - 1) / numberOfSlices;
            leftOver = (numberOfBoxes * numberOfSlices) - numberOfPeople;
            price = pricePerBox * numberOfBoxes;   
        }
        else if (pizzaType.equals("big boys")) {
            numberOfSlices = 8;
            pricePerBox = 3000;
            numberOfBoxes = (numberOfPeople + numberOfSlices - 1) / numberOfSlices;
            leftOver = (numberOfBoxes * numberOfSlices) - numberOfPeople;
            price = pricePerBox * numberOfBoxes;
        }
        else if (pizzaType.equals("odogwu")) {
            numberOfSlices = 12;
            pricePerBox = 4200;
            numberOfBoxes = (numberOfPeople + numberOfSlices - 1) / numberOfSlices;
            leftOver = (numberOfBoxes * numberOfSlices) - numberOfPeople;
            price = pricePerBox * numberOfBoxes;
        }
        else{
            System.out.println("Invalid Input");
        }
        System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");
        System.out.println("Number left over slice after serving = " + leftOver + " slices");
        System.out.println("Prices = " + price);
    }
}
        