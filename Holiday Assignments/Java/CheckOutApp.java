import java.util.Scanner;
import java.util.ArrayList;

public class CheckOutApp{
    public static void main (String[] arge){
        checkoutApp();
    }
    public static void checkoutApp(){
        boolean addMoreItems = true;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the customer's Name");
        String customerName = userInput.next();
        ArrayList<String> productList = new ArrayList<>();
        ArrayList<Integer> amountOfProductList = new ArrayList<>();
        ArrayList<Integer> costList = new ArrayList<>();
        double subTotal = 0.00;

        while (addMoreItems){
            System.out.println("What did the user buy?");
            String product = userInput.next();
	    userInput.nextLine(); 
            productList.add(product);

            System.out.println("How many pieces?");
            int amountOfProduct = userInput.nextInt();
            amountOfProductList.add(amountOfProduct);

            System.out.println("How much per unit?");
            int cost = userInput.nextInt();
            costList.add(cost);

            subTotal += amountOfProduct * cost;

            System.out.println("Add more Items?");
            String addItems = userInput.next();
            if (addItems.toLowerCase().equals("no")) {
                addMoreItems = false;
            }
        }

        System.out.println("Whats is your name?");
        String cashierName = userInput.next();
        

        System.out.println("How much discount will they get?");
        int discount = userInput.nextInt();
        
        double discountTotal = Math.round(subTotal * discount) / 100.0;
        double vat = Math.round(subTotal * 0.175);
        double billTotal = subTotal - discountTotal + vat;

        System.out.println("SEMICOLON STORES \nMAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS. \nTEL: 03293828343");
        System.out.println("Date :");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);

        System.out.println("=================================================");

        System.out.println("\nITEM\tQTY\tPRICE");

        System.out.println("-------------------------------------------------");
        for (int index = 0; index < productList.size(); index++) {
            System.out.println(productList.get(index) + "\t" + 
                             amountOfProductList.get(index) + "\t" + 
                             costList.get(index));
        }
        
        System.out.println("-------------------------------------------------");

        System.out.println("\t\t Sub Total: " + subTotal);
        System.out.println("\t\t Discount: " + discountTotal);
        System.out.println("\t\t VAT @ 17.50%: " + vat);

        System.out.println("=================================================");
        System.out.println("\t\t Bill Total: " + billTotal);

        System.out.println("=================================================");
        System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + billTotal);

        System.out.println("=================================================");

        System.out.println("How much did the customer give to you?");
        double amountPayed = userInput.nextDouble();
        double balance = amountPayed - billTotal;


        System.out.println("SEMICOLON STORES \nMAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS. \nTEL: 03293828343");
        System.out.println("Date :");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);

        System.out.println("=================================================");

        System.out.println(" \t\tITEM\tQTY\tPRICE");

        System.out.println("-------------------------------------------------");
        for (int index = 0; index < productList.size(); index++) {
            System.out.println("\t\t" + productList.get(index) + "\t" + 
                             amountOfProductList.get(index) + "\t" + 
                             costList.get(index));
        }
        
        System.out.println("-------------------------------------------------");

        System.out.println("\t\t Sub Total: " + subTotal);
        System.out.println("\t\t Discount: " + discountTotal);
        System.out.println("\t\t VAT @ 17.50%: " + vat);

        System.out.println("=================================================");
        System.out.println("\t\t Bill Total: " + billTotal);
        System.out.println("\t\t Amount Payed: " + amountPayed);
        System.out.println("\t\t Balance: " + balance);

        System.out.println("=================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");

        System.out.println("=================================================");
        
        userInput.close();

        
    }
}