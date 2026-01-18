import java.util.Scanner;

public class SalesCommisionCalculator{
    public static void main (String [] args){
        double item = 0;
        double sales = 0;
        int count = 0;

        Scanner userInput = new Scanner(System.in);

        while(count <= 1){
            System.out.print("Enter items sold: ");
            int salesPersonItems = userInput.nextInt();

            if (salesPersonItems == 1){
                item = 239.99;
            } else if (salesPersonItems == 2){
                item = 129.75;
            } else if (salesPersonItems == 3){
                item = 99.95;
            } else if (salesPersonItems == 4){
                item = 350.89;
            } else {
                System.out.println("Invalid item number");
            }

            System.out.print("Enter number of items sold: ");
            int salesItemNo = userInput.nextInt();

            sales = sales + (item * salesItemNo);
            System.out.print("Continue? (yes/no): ");
            String cont = userInput.next();

            if (cont.equals("no")){
                count = 2;
            }
            else if (cont.equals("yes")){
                count = 0;
            }
            else{
                System.out.println("Invalid input");
                count = 2;
            }
        }
        System.out.println("Total sales is: $" + sales);
        double commission = 200 + (0.09 * sales);
        System.out.println("Total commission is: $" + commission);

        userInput.close();
    }
}