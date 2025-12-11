import java.util.Scanner;

public class TestDecendingOrder {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double n1 = userInput.nextDouble();
        double n2 = userInput.nextDouble();
        double n3 = userInput.nextDouble();

        DecendingOrder.displaySortedNumbers(n1, n2, n3);
    }
}
